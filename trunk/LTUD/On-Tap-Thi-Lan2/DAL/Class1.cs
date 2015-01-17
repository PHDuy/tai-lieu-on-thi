using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DAL
{
    public class Class1
    {
        DataHocPhanDataContext db = new DataHocPhanDataContext();
        HocPhan temp = new HocPhan();
        public List<HocPhan>Select()
        {
            return db.HocPhans.ToList();
        }
        public void Insert(HocPhan hp)
        {
            db.HocPhans.InsertOnSubmit(hp);
            db.SubmitChanges();
        }
        public void  Delete(HocPhan hp)
        {
            temp = db.HocPhans.Where(tp=>tp.MaHP.Equals(hp.MaHP)).First();
            db.HocPhans.DeleteOnSubmit(temp);
            db.SubmitChanges();
        }
        public void Update(HocPhan hp)
        {
            
            temp = db.HocPhans.Where(tp => tp.MaHP.Equals(hp.MaHP)).First();
            temp.TenHP = hp.TenHP;
            temp.SoTietLT = hp.SoTietLT;
            temp.SoTietTH = hp.SoTietTH;
            db.SubmitChanges();
        }
        public List<HocPhan> Search(HocPhan hp)
        {
            return db.HocPhans.Where(tp => tp.MaHP.Equals(hp.MaHP)).ToList();
        }
    }
}

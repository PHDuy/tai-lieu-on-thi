using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DAL;

namespace BLL
{
    public class Class1
    {
        DAL.Class1 dal = new DAL.Class1();
        public List<HocPhan> Select()
        {
            return dal.Select();
        }
        public void Insert(HocPhan hp)
        {
            dal.Insert(hp);
        }
        public void Delete(HocPhan hp)
        {
            dal.Delete(hp);
        }
        public void Update(HocPhan hp)
        {
            dal.Update(hp);
          
        }
        public List<HocPhan> Search(HocPhan hp)
        {
            return dal.Search(hp);
        }
    }
}

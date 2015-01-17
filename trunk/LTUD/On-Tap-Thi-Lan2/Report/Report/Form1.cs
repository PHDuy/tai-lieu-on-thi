using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using CrystalDecisions.CrystalReports.Engine;
using System.Data.OleDb;
namespace Report
{
    public partial class Form1 : Form
    {
        OleDbDataAdapter da;
        DataSet ds = new DataSet();
        public Form1()
        {
            InitializeComponent();
        }

        private void crystalReportViewer1_Load(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            OleDbConnection con = new OleDbConnection("Provider=Microsoft.Jet.OLEDB.4.0;Data Source=De1.mdb");
            try
            {
                con.Open();
                da = new OleDbDataAdapter("select * from BanSach", con);
                da.Fill(ds,"BanSach");
                DataTable dt = new DataTable();
                dt = ds.Tables["BanSach"];
                CrystalReport1 rpt = new CrystalReport1();
                rpt.SetDataSource(dt);
                crystalReportViewer1.ReportSource = rpt;
              
            }
            catch (Exception)
            {
                
                throw;
            }
        }
    }
}

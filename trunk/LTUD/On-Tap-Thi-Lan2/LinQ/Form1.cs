using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using DAL;
using BLL;
namespace LinQ
{
    public partial class Form1 : Form
    {
        BLL.Class1 bll = new BLL.Class1();
        DAL.Class1 dal = new DAL.Class1();
        HocPhan hp = new HocPhan();
        int kt = 1;
        public Form1()
        {
            InitializeComponent();
        }
        private void SetButton(bool b)
        {

            btnLuu.Enabled = !b;
            btnThoat.Enabled = b;
            btnTim.Enabled = b;
            btnXoa.Enabled = b;
        }
        private bool SetTextbox()
        {
            foreach (Control txt in groupBox1.Controls)
            {
                if (txt.Text == string.Empty)
                {
                    MessageBox.Show("Bạn phải điền đủ thông tin");
                    return false;
                }
                break;
            }
            return true;
        }
        private void btnThem_Click(object sender, EventArgs e)
        {
            if (btnThem.Text.Equals("Thêm"))
            {
                SetButton(false);
                btnThem.Text = "Làm Mới";
                int kt = 1;
            }
            else if (btnThem.Text.Equals("Làm Mới"))
            {
                txtMaHP.ResetText();
                txtSoTC.ResetText();
                txtSoTietLT.ResetText();
                txtSoTietTH.ResetText();
                txtTenHP.ResetText();
                foreach (Control txt in this.Controls)
                {
                    if (txt.Name.Contains("txt") == true)
                    {
                        txt.Text = "";
                    }
                }
            }

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            SetButton(true);
            dataGridView1.DataSource = bll.Select();
        }

        private void btnLuu_Click(object sender, EventArgs e)
        {
            bool b = SetTextbox();
            while (b)
            {
                if (kt == 1 && btnThem.Text.Equals("Làm Mới"))
                {
                    btnThem.Text = "Thêm";
                    hp.MaHP = txtMaHP.Text.Trim();
                    hp.TenHP = txtTenHP.Text;
                    hp.SoTC = int.Parse(txtSoTC.Text);
                    hp.SoTietLT = int.Parse(txtSoTietLT.Text);
                    hp.SoTietTH = int.Parse(txtSoTietTH.Text);

                    DialogResult dr = MessageBox.Show("Bạn có muốn lưu", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
                    if (dr == DialogResult.Yes)
                    {
                        bool ktg = KiemTraGridview();
                        if (ktg)
                        {
                            bll.Insert(hp);
                        }
                       
                    }
                }
                Form1_Load(sender, e);
                break;
            }

        }
        private void txtSoTC_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsNumber(e.KeyChar))
            {
                MessageBox.Show("Bạn phải nhập vào số", "Thông báo");
                e.Handled = true;
            }
           
        }

        private void txtSoTietLT_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsNumber(e.KeyChar))
            {
                MessageBox.Show("Bạn phải nhập vào số", "Thông báo");
                e.Handled = true;
            }
        }

        private void txtSoTietTH_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsNumber(e.KeyChar))
            {
                MessageBox.Show("Bạn phải nhập vào số", "Thông báo");
                txtSoTietTH.Clear();
            }
            
        }

        private void btnXoa_Click(object sender, EventArgs e)
        {
            hp.MaHP = txtMaHP.Text;
            DialogResult dr = MessageBox.Show("Bạn có muốn xóa không", "Thông Báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (dr == DialogResult.Yes)
            {
                if (hp.MaHP.Trim().Equals(txtMaHP.Text))
                {
                    bll.Delete(hp);
                    MessageBox.Show("Xóa thành công" + txtMaHP.Text);

                }
                dataGridView1.DataSource = bll.Select();
            }
            else
            {

            }
            Form1_Load(sender, e);

        }

        private void btnThoat_Click(object sender, EventArgs e)
        {
            DialogResult dr = MessageBox.Show("Bạn có muốn xóa không", "Thông Báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (dr == DialogResult.Yes)
            {
                Application.Exit();
            }
        }

        private void btnTim_Click(object sender, EventArgs e)
        {
            if (txtMaHP.Text!=string.Empty)
            {
                hp.MaHP = txtMaHP.Text;
                dataGridView1.DataSource = bll.Search(hp);
            }
            else
            {
                MessageBox.Show("Không có dữ liệu");
            }

        }
        bool KiemTraGridview()
        {
            foreach (DataGridViewRow item in dataGridView1.Rows)
            {
                    if (item.Cells["MaHP"].Value.Equals(txtMaHP.Text))
                    {
                        MessageBox.Show("Mã học phần đã tồn tại"+txtMaHP.Text);
                        return false;
                    }
                break;
                
            }
            return true;
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            int i = e.RowIndex;
            txtMaHP.Text = dataGridView1.Rows[i].Cells[0].Value.ToString();
            txtTenHP.Text = dataGridView1.Rows[i].Cells[1].Value.ToString();
            txtSoTC.Text = dataGridView1.Rows[i].Cells[2].Value.ToString();
            txtSoTietLT.Text = dataGridView1.Rows[i].Cells[3].Value.ToString();
            txtSoTietTH.Text = dataGridView1.Rows[i].Cells[4].Value.ToString();
        }
    }
}



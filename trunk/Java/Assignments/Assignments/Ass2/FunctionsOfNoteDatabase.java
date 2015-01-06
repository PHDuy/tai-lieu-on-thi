package midExam;

public interface FunctionsOfNoteDatabase {
	// Sắp xếp các đối tượng dữ liệu theo thuật toán nổi bọt
	public void bubbleSort(Object[] data);
	// Sắp xếp các đối tượng dữ liệu theo thuật toán thêm dần
	public void insertionSort(Object[] data);
	// Tìm ra những sinh viên có điểm tổng kết nhỏ hơn 5, hiển thị ra màn hình
	public void findNotSatisfied();
	// Tìm ra 5 sinh viên có điểm tổng kết cao nhất
	public void findGoods();
	// Hiển thị ra màn hình toàn bộ danh sách sinh viên theo dạng (Mã:Tên:Điểm Ass:Điểm giữa kỳ:Điểm cuối kỳ:Điểm tổng kết)
	public void out();
}

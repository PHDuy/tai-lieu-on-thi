package caculator;

import java.awt.*;
import java.awt.event.*;

public class MenuExample2 extends Frame {
	private PopupMenu optionsMenu;
	private TextField tfNotify = new TextField("There is not a pressed Menu");
	private int width, heigh;

	public MenuExample2() {
		setTitle("Menu Example");
		setSize(800, 600);
		setVisible(true);

		// Lay kich thuoc cua Frame
		width = this.getWidth();
		heigh = this.getHeight();

		setLayout(new BorderLayout());
		add(tfNotify, BorderLayout.SOUTH);
		add(new Label(" "), BorderLayout.NORTH);
		add(new Label(" "), BorderLayout.WEST);
		add(new Label(" "), BorderLayout.CENTER);
		add(new Label(" "), BorderLayout.EAST);

		// Set Menu bar
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);

		// Set for each menu
		Menu fileMenu = new Menu("File");
		mbar.add(fileMenu);
		MenuItem newItem = new MenuItem("New");
		fileMenu.add(newItem);
		newItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfNotify.setText("New action in the file menu is pressed");
			}
		});

		MenuItem openItem = new MenuItem("Open");
		fileMenu.add(openItem);
		openItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfNotify.setText("Open action in the file menu is pressed");
			}
		});

		fileMenu.addSeparator();
		MenuItem saveItem = new MenuItem("Save");
		fileMenu.add(saveItem);
		saveItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfNotify.setText("Save action in the file menu is pressed");
			}
		});

		MenuItem saveAsItem = new MenuItem("Save As");
		fileMenu.add(saveAsItem);
		saveAsItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfNotify.setText("Save As action in the file menu is pressed");
			}
		});

		fileMenu.addSeparator();
		MenuItem exitItem = new MenuItem("Exit");
		fileMenu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		Menu editMenu = new Menu("Edit");
		mbar.add(editMenu);

		MenuItem cutItem = new MenuItem("Cut");
		editMenu.add(cutItem);
		cutItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfNotify.setText("Cut action in the Edit menu is pressed");
			}
		});

		MenuItem copyItem = new MenuItem("Copy");
		editMenu.add(copyItem);
		copyItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfNotify.setText("Copy action in the Edit menu is pressed");
			}
		});

		MenuItem pasteItem = new MenuItem("Paste");
		editMenu.add(pasteItem);
		pasteItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfNotify.setText("Past action in the Edit menu is pressed");
			}
		});

		editMenu.addSeparator();

		Menu helpMenu = new Menu("Help");
		mbar.add(helpMenu);

		MenuItem contentItem = new MenuItem("Content");
		helpMenu.add(contentItem);
		contentItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfNotify.setText("Content action in the Help menu is pressed");
			}
		});

		MenuItem indexItem = new MenuItem("Index");
		helpMenu.add(indexItem);
		indexItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfNotify.setText("Index action in the Help menu is pressed");
			}
		});

		Menu findMenu = new Menu("Find");
		helpMenu.add(findMenu);
		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				// Khi nhap chuot ben trong Frame
				int x = arg0.getX();
				int y = arg0.getY();
				if ((x > 0 && x < width) || (y > 0 && y < heigh)) {
					showOptionsMenu(x, y);
				}
			}
		});

		MenuItem nameItem = new MenuItem("Search by Name");
		findMenu.add(nameItem);
		MenuItem cacheItem = new MenuItem("Search from cache");
		findMenu.add(cacheItem);
		optionsMenu = new PopupMenu("Options");
		editMenu.add(optionsMenu);

		MenuItem readItem = new MenuItem("Read Only");
		optionsMenu.add(readItem);
		optionsMenu.addSeparator();
		Menu formatMenu = new Menu("Format text");
		optionsMenu.add(formatMenu);
		this.add(optionsMenu);

		CheckboxMenuItem insertItem = new CheckboxMenuItem("Insert", true);
		formatMenu.add(insertItem);
		CheckboxMenuItem overtypeItem = new CheckboxMenuItem("Overtype", false);
		formatMenu.add(overtypeItem);

		// Event for close box
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	public void showOptionsMenu(int x, int y) {
		optionsMenu.show(this, x, y);
	}

	public static void main(String[] args) {
		MenuExample frame = new MenuExample();
		frame.show();
	}
}

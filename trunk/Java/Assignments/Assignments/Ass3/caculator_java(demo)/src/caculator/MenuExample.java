package caculator;

import java.awt.*;
import java.awt.event.*;

public class MenuExample extends Frame implements ActionListener, MouseListener {
	PopupMenu optionsMenu;
	public MenuExample() {
		setTitle("Menu Example");
		setSize(300, 200);
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);
		Menu fileMenu = new Menu("File");
		mbar.add(fileMenu);
		fileMenu.addActionListener(this);
		MenuItem newItem = new MenuItem("New");
		fileMenu.add(newItem);
		MenuItem openItem = new MenuItem("Open");
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		MenuItem saveItem = new MenuItem("Save");
		fileMenu.add(saveItem);
		MenuItem saveAsItem = new MenuItem("Save As");
		fileMenu.add(saveAsItem);
		fileMenu.addSeparator();
		MenuItem exitItem = new MenuItem("Exit");
		fileMenu.add(exitItem);
		saveAsItem.addActionListener(this);
		Menu editMenu = new Menu("Edit");
		mbar.add(editMenu);
		editMenu.addActionListener(this);
		MenuItem cutItem = new MenuItem("Cut");
		editMenu.add(cutItem);
		MenuItem copyItem = new MenuItem("Copy");
		editMenu.add(copyItem);
		MenuItem pasteItem = new MenuItem("Paste");
		editMenu.add(pasteItem);
		editMenu.addSeparator();
		Menu helpMenu = new Menu("Help");
		mbar.add(helpMenu);
		helpMenu.addActionListener(this);
		MenuItem contentItem = new MenuItem("Content");
		helpMenu.add(contentItem);
		MenuItem indexItem = new MenuItem("Index");
		helpMenu.add(indexItem);
		Menu findMenu = new Menu("Find");
		helpMenu.add(findMenu);
		addMouseListener(this);
		MenuItem nameItem = new MenuItem("Search by Name");
		findMenu.add(nameItem);
		MenuItem cacheItem = new MenuItem("Search from cache");
		findMenu.add(cacheItem);
		optionsMenu = new PopupMenu("Options");
		editMenu.add(optionsMenu);
		optionsMenu.addActionListener(this);
		MenuItem readItem = new MenuItem("Read Only");
		optionsMenu.add(readItem);
		optionsMenu.addSeparator();
		Menu formatMenu = new Menu("Format text");
		optionsMenu.add(formatMenu);
		this.add(optionsMenu);
		formatMenu.addActionListener(this);
		CheckboxMenuItem insertItem = new CheckboxMenuItem("Insert", true);
		formatMenu.add(insertItem);
		CheckboxMenuItem overtypeItem = new CheckboxMenuItem("Overtype", false);
		formatMenu.add(overtypeItem);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Exit")) {
			System.exit(0);
		}
	}

	public void mouseEntered(MouseEvent m) {
	}

	public void mouseExited(MouseEvent m) {
	}

	public void mouseClicked(MouseEvent m) {
		optionsMenu.show(this, m.getX(), m.getY());
	}

	public void mouseReleased(MouseEvent m) {
	}

	public void mousePressed(MouseEvent m) {
	}

	public static void main(String[] args) {
		MenuExample frame = new MenuExample();
		frame.show();
	}
}

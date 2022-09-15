// craeted by Taesik Kim
// for CS211 practice, Fall quarter 2018.
package Assignment7;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

class treeInfo {
	int value;
	int x;
	int y;
	int size;
	int level;
}

public class heapTreeGUI extends JFrame {

	static ArrayList<treeInfo> tree = new ArrayList<>();
	static int width, height; // screen
	static int nodeSize = 45; // node radius
	static int levels; // depth
	static int level = 1;
	static int prevLevel = 0;
	static int y = nodeSize;

	static int R, G, B;
	static Color color;

	public heapTreeGUI(int[] ht) {
		super("HeapTree (CS211 Fall 2018)");
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		levels = getLevels(ht); // howmany levels? (depth)

		// tree width & Height
		width = ((int) Math.pow(2, levels - 1) + 1) * (int) (nodeSize * 1.5);
		height = levels * nodeSize * 2;
		setBounds(0, 0, width, height);

		// total nodes
		int totalNodes = 0;
		for (int i = 1; i <= levels; i++) {
			totalNodes += (int) Math.pow(2, i - 1);
		}

		// create lookup array
		int[] look = new int[totalNodes + 1];

		System.out.println("look up: " + look.length);

		double x;
		for (int i = levels; i > 0; i--) {
			int start = (int) Math.pow(2, i - 1);
			int end = start * 2;

			if (i == levels) {
				look[start] = nodeSize;
				x = nodeSize;
				for (int j = start + 1; j < end; j++) {
					x = x + nodeSize * 1.5;
					look[j] = (int) x;
				}
			} else
				for (int j = start; j < end; j++) {
					look[j] = (look[j * 2] + look[j * 2 + 1]) / 2;
				}
		}

		// save lookup into an arrayList
		for (int i = 0; i < ht.length; i++) {
			treeInfo t = new treeInfo();
			t.value = ht[i];
			t.x = look[i];
			t.y = y;

			if (i + 1 > Math.pow(2, level)) {
				level++;
			}
			t.level = level;

			if (prevLevel != level) {
				y += nodeSize * 1.2;
				t.y = y;
				prevLevel = level;
			}
			t.size = nodeSize;
			tree.add(t);
		}
	}

	public static int getLevels(int[] ht) {

		for (int i = 1; i < 10; i++) {
			if ((ht.length - 1) < Math.pow(2, i)) {
				levels = i;
				break;
			}
		}
		return levels;
	}

	public void paint(Graphics g) {

		drawTree(g);

		// if you want to add animation to the tree
		// try{
		// Thread.sleep(30);
		// } catch (Exception exc){}
		// repaint();
	}

	public void drawTree(Graphics g) {

		// back ground
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);

		// line
		g.setColor(color.WHITE);
		for (int i = 1; i < tree.size(); i++) {
			// left childe
			if (i * 2 < tree.size()) {
				int fromX = tree.get(i).x;
				int fromY = tree.get(i).y;
				int toX = tree.get(i * 2).x;
				int toY = tree.get(i * 2).y;
				g.drawLine(fromX + nodeSize / 2, fromY + nodeSize / 2, toX + nodeSize / 2, toY + nodeSize / 2);
			}
			// right child
			if ((i * 2 + 1) < tree.size()) {
				int fromX = tree.get(i).x;
				int fromY = tree.get(i).y;
				int toX = tree.get(i * 2 + 1).x;
				int toY = tree.get(i * 2 + 1).y;
				g.drawLine(fromX + nodeSize / 2, fromY + nodeSize / 2, toX + nodeSize / 2, toY + nodeSize / 2);
			}
		}

		// node
		g.setColor(color.GREEN);
		for (int i = 1; i < tree.size(); i++) {
			g.fillOval(tree.get(i).x, tree.get(i).y, tree.get(i).size, tree.get(i).size);
		}

		// number
		g.setColor(color.BLACK);
		g.setFont(new Font("TimesRoman", Font.PLAIN, nodeSize / 2));
		for (int i = 1; i < tree.size(); i++) {
			String s = Integer.toString(tree.get(i).value);
			g.drawString(s, tree.get(i).x + (nodeSize / 4), tree.get(i).y + (nodeSize / 2 + 10));
		}
	}
}
package com.chap1;

import java.util.ArrayList;
import java.util.List;

public class NodeTraverse {

	List<Node> nodeList;

	public NodeTraverse() {
		nodeList = new ArrayList<Node>();

	}

	class Node {

		String val;

		public Node(String val) {
			this.val = val;
		}

		public boolean equals(Object o) {
			if (null == o)
				return false;

			if (o.getClass() == this.getClass()) {

				if (((Node) o).val.equals(this.val))
					return true;
			}
			return false;

		}

	}

	public int indexOf(Node n) {

		int idx = -1;
		for (int i = 0; i < nodeList.size(); i++) {
			if (n.equals(nodeList.get(i)))
				return i;

		}
		return idx;

	}

}

package bai2;

import java.util.ArrayList;

import action.ThiSinhAction;
import bean.ThiSinh;

public class ThiSinhDemo {

	public static void main(String[] args) {
		ThiSinhAction objThiSinhAction = new ThiSinhAction();
		ArrayList<ThiSinh> list = objThiSinhAction.inputData();
		objThiSinhAction.displayData(list);
		objThiSinhAction.thiSinhTrungTuyen(list);
		objThiSinhAction.sortThiSinh(list);

	}

}

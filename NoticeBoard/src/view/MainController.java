package view;

import java.time.LocalDate;

import domain.Notice;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import util.AppUtil;

public class MainController {
	@FXML
	private DatePicker datePicker;
	@FXML
	private TextField txtName;
	
	@FXML
	private ListView<Notice> list;
	
	private ObservableList<Notice> items;
	
	@FXML
	private void initialize() {
		items = FXCollections.observableArrayList();
		list.setItems(items);
	}
	
	public void addNotice() {
		String name = txtName.getText();
		
		if(name.isEmpty()) {
			AppUtil.alert("������ �̸��� �Է��ϼž� �մϴ�.", null);
			return;
		}
		
		LocalDate date = datePicker.getValue();
		if(date == null) {
			AppUtil.alert("��¥�� �Է��ϼ���", null);
			return;
		}
		
		Notice notice = new Notice(name, date);
		items.add(notice);
	}
	
	public void delNotice() {
		int idx = list.getSelectionModel().getSelectedIndex();
		if(idx >= 0) {
			items.remove(idx);
		}else {
			AppUtil.alert("������ �������� �����ϼ���", "����");
		}
	}
}

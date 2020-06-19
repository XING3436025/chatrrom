package per.xin.chatroom.service;


import per.xin.chatroom.entity.Staff;

public interface IStaffSV {
	Staff getStaff(int staffId);
	Staff getStaff(String code);
	int updateHead(Staff staff);
	void UpdateStaff(Staff staff);
	int updateState(Staff staff);
	String register(String code, String pwd);
}

package businesslogic;

import businesslogicsevice.ResultMessage;
import businesslogicsevice.UserBLService;

public class UserBLService_Stub implements UserBLService{

	@Override
	public ResultMessage login(int id, String password) {
		// TODO Auto-generated method stub
		if(id==1&&password=="123456")
			return ResultMessage.Success;
		else return ResultMessage.Fail;			
	}

}

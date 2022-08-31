package Service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import DAO.HomeDAOImplement;
import Interface.HomeService;
import Model.Prize;

@Service
public class HomeServiceImplement implements HomeService{

	HomeDAOImplement homeDAOimpl;
	
	@Override
	public List<Prize> getAllPrize() {
		// TODO Auto-generated method stub
		return homeDAOimpl.getAllPrize();
	}

	@Override
	public Prize getPrize(int prizeId) {
		// TODO Auto-generated method stub
		return homeDAOimpl.getPrize(prizeId);
	}

	@Override
	public ResponseEntity addPrize(Prize prize) {
		// TODO Auto-generated method stub
		return homeDAOimpl.addPrize(prize);
	}

}

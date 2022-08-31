package DAO;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import Interface.HomeDAO;
import Model.Prize;

@Repository
public class HomeDAOImplement implements HomeDAO {
	
	@Override
	public List<Prize> getAllPrize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prize getPrize(int prizeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ResponseEntity addPrize(Prize prize) {
		// TODO Auto-generated method stub
		
		return null;
	}

}

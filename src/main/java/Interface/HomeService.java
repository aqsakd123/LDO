package Interface;

import java.util.List;

import org.springframework.http.ResponseEntity;

import Model.Prize;

public interface HomeService {
	
	public List<Prize> getAllPrize();
	
	public Prize getPrize(int prizeId);
	
	public ResponseEntity addPrize(Prize prize);

}

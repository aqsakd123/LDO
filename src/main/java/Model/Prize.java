package Model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Entity;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Prize {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;

	@NonNull
	public Date Date_Input;

	@NonNull
	public int SpecPrize;

	@NonNull
	public int Prize1;

	@NonNull
	public int Prize2;
	
	@NonNull
	public int Prize3;
	
	@NonNull
	public int Prize4;
	
	@NonNull
	public int Prize5;
	
	@NonNull
	public int Prize6;
	
	@NonNull
	public int Prize7;
	
	@NonNull
	public int Prize8;
	
	@NonNull
	public int Prize9;
	
	@NonNull
	public int Prize10;
	
	@NonNull
	public int Prize11;
	
	@NonNull
	public int Prize12;
	
	@NonNull
	public int Prize13;
	
	@NonNull
	public int Prize14;
	
	@NonNull
	public int Prize15;
	
	@NonNull
	public int Prize16;
	
	@NonNull
	public int Prize17;
	
	@NonNull
	public int Prize18;
	
	@NonNull
	public int Prize19;
	
	@NonNull
	public int Prize20;
	
	@NonNull
	public int Prize21;
	
	@NonNull
	public int Prize22;
	
	@NonNull
	public int Prize23;
	
	@NonNull
	public int Prize24;
	
	@NonNull
	public int Prize25;
	
	@NonNull
	public int Prize26;
	
	@NonNull
	public int Prize27;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_Input() {
		return Date_Input;
	}

	public void setDate_Input(Date date_Input) {
		Date_Input = date_Input;
	}

	public int getSpecPrize() {
		return SpecPrize;
	}

	public void setSpecPrize(int specPrize) {
		SpecPrize = specPrize;
	}

	public int getPrize1() {
		return Prize1;
	}

	public void setPrize1(int prize1) {
		Prize1 = prize1;
	}

	public int getPrize2() {
		return Prize2;
	}

	public void setPrize2(int prize2) {
		Prize2 = prize2;
	}

	public int getPrize3() {
		return Prize3;
	}

	public void setPrize3(int prize3) {
		Prize3 = prize3;
	}

	public int getPrize4() {
		return Prize4;
	}

	public void setPrize4(int prize4) {
		Prize4 = prize4;
	}

	public int getPrize5() {
		return Prize5;
	}

	public void setPrize5(int prize5) {
		Prize5 = prize5;
	}

	public int getPrize6() {
		return Prize6;
	}

	public void setPrize6(int prize6) {
		Prize6 = prize6;
	}

	public int getPrize7() {
		return Prize7;
	}

	public void setPrize7(int prize7) {
		Prize7 = prize7;
	}

	public int getPrize8() {
		return Prize8;
	}

	public void setPrize8(int prize8) {
		Prize8 = prize8;
	}

	public int getPrize9() {
		return Prize9;
	}

	public void setPrize9(int prize9) {
		Prize9 = prize9;
	}

	public int getPrize10() {
		return Prize10;
	}

	public void setPrize10(int prize10) {
		Prize10 = prize10;
	}

	public int getPrize11() {
		return Prize11;
	}

	public void setPrize11(int prize11) {
		Prize11 = prize11;
	}

	public int getPrize12() {
		return Prize12;
	}

	public void setPrize12(int prize12) {
		Prize12 = prize12;
	}

	public int getPrize13() {
		return Prize13;
	}

	public void setPrize13(int prize13) {
		Prize13 = prize13;
	}

	public int getPrize14() {
		return Prize14;
	}

	public void setPrize14(int prize14) {
		Prize14 = prize14;
	}

	public int getPrize15() {
		return Prize15;
	}

	public void setPrize15(int prize15) {
		Prize15 = prize15;
	}

	public int getPrize16() {
		return Prize16;
	}

	public void setPrize16(int prize16) {
		Prize16 = prize16;
	}

	public int getPrize17() {
		return Prize17;
	}

	public void setPrize17(int prize17) {
		Prize17 = prize17;
	}

	public int getPrize18() {
		return Prize18;
	}

	public void setPrize18(int prize18) {
		Prize18 = prize18;
	}

	public int getPrize19() {
		return Prize19;
	}

	public void setPrize19(int prize19) {
		Prize19 = prize19;
	}

	public int getPrize20() {
		return Prize20;
	}

	public void setPrize20(int prize20) {
		Prize20 = prize20;
	}

	public int getPrize21() {
		return Prize21;
	}

	public void setPrize21(int prize21) {
		Prize21 = prize21;
	}

	public int getPrize22() {
		return Prize22;
	}

	public void setPrize22(int prize22) {
		Prize22 = prize22;
	}

	public int getPrize23() {
		return Prize23;
	}

	public void setPrize23(int prize23) {
		Prize23 = prize23;
	}

	public int getPrize24() {
		return Prize24;
	}

	public void setPrize24(int prize24) {
		Prize24 = prize24;
	}

	public int getPrize25() {
		return Prize25;
	}

	public void setPrize25(int prize25) {
		Prize25 = prize25;
	}

	public int getPrize26() {
		return Prize26;
	}

	public void setPrize26(int prize26) {
		Prize26 = prize26;
	}

	public Prize() {
		super();
	}

	public Prize(int id, @NonNull Date date_Input, @NonNull int specPrize, @NonNull int prize1, @NonNull int prize2,
			@NonNull int prize3, @NonNull int prize4, @NonNull int prize5, @NonNull int prize6, @NonNull int prize7,
			@NonNull int prize8, @NonNull int prize9, @NonNull int prize10, @NonNull int prize11, @NonNull int prize12,
			@NonNull int prize13, @NonNull int prize14, @NonNull int prize15, @NonNull int prize16,
			@NonNull int prize17, @NonNull int prize18, @NonNull int prize19, @NonNull int prize20,
			@NonNull int prize21, @NonNull int prize22, @NonNull int prize23, @NonNull int prize24,
			@NonNull int prize25, @NonNull int prize26) {
		super();
		this.id = id;
		Date_Input = date_Input;
		SpecPrize = specPrize;
		Prize1 = prize1;
		Prize2 = prize2;
		Prize3 = prize3;
		Prize4 = prize4;
		Prize5 = prize5;
		Prize6 = prize6;
		Prize7 = prize7;
		Prize8 = prize8;
		Prize9 = prize9;
		Prize10 = prize10;
		Prize11 = prize11;
		Prize12 = prize12;
		Prize13 = prize13;
		Prize14 = prize14;
		Prize15 = prize15;
		Prize16 = prize16;
		Prize17 = prize17;
		Prize18 = prize18;
		Prize19 = prize19;
		Prize20 = prize20;
		Prize21 = prize21;
		Prize22 = prize22;
		Prize23 = prize23;
		Prize24 = prize24;
		Prize25 = prize25;
		Prize26 = prize26;
	}
	
	

}

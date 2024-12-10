package tech.reliab.course.reshetova.bank.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString

//платежный счет
public class PaymentAccount {
    private int id; //Id платёжного счета
    private int idUser; //Пользователь, за которым закреплен этот платежный счет
    private int idBank; //Название банка, в котором открыт этот счет
    private int sum = 0;    //Сумма, которая лежит в данный момент на счету (по умолчанию 0)
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }*/
}
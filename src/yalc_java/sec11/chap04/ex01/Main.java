package yalc_java.sec11.chap04.ex01;

import fc_java.poly.A;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.addMoney(5000);

        Thread thr1 = new Thread(
                new CustomerRun("철수", atm, 500)
        );
        Thread thr2 = new Thread(
                new CustomerRun("영희", atm, 300)
        );
        Thread thr3 = new Thread(
                new CustomerRun("돌준", atm, 400)
        );
        thr1.start();
        thr2.start();
        thr3.start();

        // 나중에 현 잔액이 음수가 나옴... -> 왜? 우리 balacne보다 인출하는 값이 많으면 return해놨는데?
        // 인출하는데 random함수로 시간이 걸리는데, 그 때 다른 thread가 접근해서 balance를 확인해보니까 돈있는줄 알고 또 인출해버림
        // synchronized 이용해서 메서드 사용
    }
}

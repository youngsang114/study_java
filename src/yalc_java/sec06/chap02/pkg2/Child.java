package yalc_java.sec06.chap02.pkg2;

//  상단에 임포트 필요

import yalc_java.sec06.chap02.pkg1.Parent;

public class Child extends Parent {
    //  Parent와 다른 패키지
    //  int aa = a; // ⚠️ 불가
    //  int bb = b; // ⚠️ 불가 -> default도 사용할 수 없다(default : 같은 패키지안에서)
    int cc = c; // 💡 protected - 다른 패키지, 상속관계
    int dd = d;
}
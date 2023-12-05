package yalc_java.sec08.chap03;

import com.sun.source.tree.Tree;
import yalc_java.sec07.chap04.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intHSet1 = new HashSet<>();
        intHSet1.add(1);
        intHSet1.add(1);
        intHSet1.add(2);
        intHSet1.add(3);

        List<Integer> ints1 = new ArrayList(
                Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 7)
        );
        // ArrayList를 HashSet의 생성자에 넣을 수 있다
        // HashSet의 생성자 -> Collection을 받는다

        Set<Integer> intHSet2 = new HashSet<>(ints1);

        //  💡 for-each문 사용 가능
        for (Integer i :intHSet1) {
            System.out.println(i);
        }

        //  ⭐️ 아래와 같이 응용 가능
        //  - 중복을 제거한 ArrayList
        ints1.clear();
        ints1.addAll(intHSet2); // 이렇게 하면 ArrayList인 ints1의 중복값을 모두 삭제할 수 있다

        //  포함 여부
        boolean has2 = intHSet1.contains(2);
        boolean has4 = intHSet1.contains(4);

        //  [요소 삭제], [있었는지 여부] [반환] -> boolean으로 반환
        boolean rm3 = intHSet1.remove(3);
        boolean rm4 = intHSet1.remove(4);

        //  다른 콜렉션 기준으로 내용 삭제
        intHSet2.removeAll(intHSet1); // 3,4,5,6,7

        //  💡 그 외 size, isEmpty, clear, clone 등의 메소드들 확인
        //  참조형 관련
        Set<Swordman> swordmenSet = new HashSet<>();
        Swordman swordman = new Swordman(Side.RED);

        swordmenSet.add(swordman); // 여기서 한번
        swordmenSet.add(swordman);
        swordmenSet.add(new Swordman(Side.RED)); // 여기서 두번
        swordmenSet.add(new Swordman(Side.RED)); // 여기서 세번
        swordmenSet.remove(swordman); // 실행해보기 // 첫번째 소드멘 삭제!-> 제거할 떼, 주소가 저장되어있어야 한다

        HashSet<Integer> intHashSet = new HashSet<>();
        LinkedHashSet<Integer> intLinkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> intTreeSet = new TreeSet<>();

        for (int i : new int[] { 3, 1, 8, 5, 4, 7, 2, 9, 6}) {
            intHashSet.add(i);
            intLinkedHashSet.add(i);
            intTreeSet.add(i);
        }
        for (Set s : new Set[] {intHashSet, intLinkedHashSet, intTreeSet}) {
            System.out.println(s);
        }
        //  ⭐️ LinkedHashSet : 입력된 순서대로 / TreeSet : 오름차순
        //  ⚠️ HashSet이 정렬된 것처럼 보이지만 보장된 것이 아님
        //  - Hash 방식에 의한 특정 조건에서의 정렬일 뿐

        // [1, 2, 3, 4, 5, 6, 7, 8, 9] // HashSet은 정렬된 것 처럼 보이지만, 실제론 정렬기능 없음
        // [3, 1, 8, 5, 4, 7, 2, 9, 6] // LinkedHashSet도 정렬 기능 없음
        // [1, 2, 3, 4, 5, 6, 7, 8, 9] : TreeSet만 정렬(오름차순)됨

        Set<String> strHashSet = new HashSet<>();
        Set<String> strLinkedHashSet = new LinkedHashSet<>();
        TreeSet<String> strTreeSet = new TreeSet<>();

        for (String s : new String[] {
                "Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"
        }) {
            strHashSet.add(s);
            strLinkedHashSet.add(s);
            strTreeSet.add(s);
        }
        for (Set s : new Set[] {strHashSet, strLinkedHashSet, strTreeSet}) {
            System.out.println(s);
        }

        // [Apple, Game, Car, Elephant, Dice, Fox, Banana] -> HashSet 정렬 안됨~
        // [Fox, Banana, Elephant, Car, Apple, Game, Dice]
        // [Apple, Banana, Car, Dice, Elephant, Fox, Game] ->TreeSet이 오름차순으로 정렬된다

        System.out.println("TreeSet에 관련된 기능들");
        //  💡 TreeSet의 주요 메소드들
        int firstInt = intTreeSet.first();
        String lastStr = strTreeSet.last();

        //  같은 것이 없다면 트리 구조상 바로 위의 것 (바로 더 큰 것) 반환
        String foxCeiling = strTreeSet.ceiling("Fox");
        String creamCeiling = strTreeSet.ceiling("Cream");

        //  같은 것이 없다면 트리 구조상 바로 아래의 것 (바로 더 작은 것) 반환
        String foxFloor = strTreeSet.floor("Fox");
        String diceFloor = strTreeSet.floor("Cream");

        //  맨 앞에서/뒤에서 제거

        int pollFirst1 = intTreeSet.pollFirst(); //1
        int pollFirst2 = intTreeSet.pollFirst(); //2

        int pollLast1 = intTreeSet.pollLast(); //9
        int pollLast2 = intTreeSet.pollLast(); //8

        //  순서가 뒤집힌 NavigableSet 반환
        // descendingSet()은 NavigableSet을 반환하는데, 이를 저장할 수 있는 것을 보니, TreeSet이 NavigableSet을 implements 했다는 것을 앐 수 있다.
        Set<String> strTreeSetDesc = (TreeSet<String>) strTreeSet.descendingSet();

        //  ⚠️ 요소로 추가 불가
        //  - 이후 배울 Comparable 또는 Comparator 필요
        // TreeSet은 순서를 나타내주기 때문에, 요소들간의 크기를 비교할 수 있어야되는데,,, -> TreeSet에서는 오류가 남
        // 이 Knight들은 순서가 없다.. 그렇기에 -> Comparable, Comparator가 필요하다

//        TreeSet<Knight> knightSet1 = new TreeSet<>();
//        knightSet1.add(new Knight(Side.BLUE));
//        knightSet1.add(new Knight(Side.BLUE));
//        knightSet1.add(new Knight(Side.BLUE));
    }
}

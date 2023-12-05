package yalc_java.sec08.chap06;

import yalc_java.sec07.chap04.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intHSet = new HashSet<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
        );

        //  💡 이터레이터 반환 및 초기화
        //  - 기타 Collection 인터페이스를 구현한 클래스들에도 존재
        // 이터레이터의 인스턴스
        Iterator<Integer> intItor = intHSet.iterator();

        // 💡 next : 자리를 옮기며 다음 요소 반환
        Integer int1 = intItor.next();
        Integer int2 = intItor.next();
        Integer int3 = intItor.next();

        //  💡 hasNext : 순회가 끝났는지 여부 반환
        boolean hasNext = intItor.hasNext();

        //  ⭐️ 순회 초기화
        intItor = intHSet.iterator();

//          💡 remove : 현 위치의 요소 삭제
        while (intItor.hasNext()) {
            if (intItor.next() % 3 == 0) {
                intItor.remove();
            }
        }

        //  ⚠️ foreach 문으로 시도하면 오류

        // 컬렉션 내부에서 이터레이터를 사용하는데, foreach문은 내부적으로 개수를 정하고 그만큼 반복하는 것이기 때문에, 삭제되면 오류가 생기므로
        // foreach문으로 컬렉션의 요소를 삭제하는 것은 금지되어 있다
        for (Integer num : intHSet) {
            if (num % 3 == 0) intHSet.remove(num);
        }
        // 그래서 삭제할때 이터레이터의 기능을 이용해서 삭제해줘야한다

        List<Unit> enemies = new ArrayList<>(
                Arrays.asList(
                        new Swordman(Side.RED),
                        new Knight(Side.RED),
                        new Swordman(Side.RED),
                        new Swordman(Side.RED),
                        new Knight(Side.RED),
                        new Knight(Side.RED),
                        new Swordman(Side.RED),
                        new MagicKnight(Side.RED),
                        new Swordman(Side.RED),
                        new MagicKnight(Side.RED),
                        new Knight(Side.RED),
                        new MagicKnight(Side.RED))
        );

        Iterator<Unit> enemyItor = enemies.iterator();

        int thunderBolts = 3;
        int fireBalls = 4;

        while (enemyItor.hasNext() && thunderBolts-- > 0) {
            Unit enemy = enemyItor.next();
            System.out.printf("%s 벼락 공격%n", enemy);
            enemy.hp -= 50;
        }
        while (enemyItor.hasNext() && fireBalls-- > 0) {
            Unit enemy = enemyItor.next();
            System.out.printf("%s 파이어볼 공격%n", enemy);
            enemy.hp -= 30;
        }
        while (enemyItor.hasNext()) {
            Unit enemy = enemyItor.next();
            System.out.printf("%s 화살 공격%n", enemy);
            enemy.hp -= 10;
        }

        // 맵의 이터레이터는 셋,리스트의 이터레이터와는 살짝 다르다!!!

        System.out.println("\n- - - - -\n");

        Map<Integer, Double> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i + 1, Math.random() * 10);
        }

        //  ⭐️ 맵의 경우는 아래와 같이 이터레이션
        //  - 키, 값 또는 엔트리의 컬렉션을 반환받아 이터레이트
        Iterator<Integer> hmKeyItor = hashMap.keySet().iterator();
        Iterator<Double> hmValueItor = hashMap.values().iterator();
        Iterator<Map.Entry<Integer, Double>> hmEntryItor = hashMap.entrySet().iterator();

        while (hmKeyItor.hasNext()) {
            System.out.println(hmKeyItor.next());
        }
        System.out.println("\n- - - - -\n");

        while (hmValueItor.hasNext()) {
            System.out.println(hmValueItor.next());
        }
        System.out.println("\n- - - - -\n");

        while (hmEntryItor.hasNext()) {
            System.out.println(hmEntryItor.next());
        }

        //  ⭐ 이들은 따로 반환된 컬렉션의 이터레이터
        //  - 여기서 remove하는 것은 원본 맵에 영향 끼치지 않음
        while (hmKeyItor.hasNext()) {
            int i = hmKeyItor.next();
            if (i % 3 == 0) hmKeyItor.remove();
        }
        while (hmValueItor.hasNext()) {
            double d = hmValueItor.next();
            if (d < 5) hmValueItor.remove();
        }
        while (hmEntryItor.hasNext()) {
            Map.Entry<Integer, Double> e = hmEntryItor.next();
            if (e.getKey() % 2 == 0) {
                hmEntryItor.remove();
            }
        }
    }
}

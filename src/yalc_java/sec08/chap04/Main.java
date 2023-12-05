package yalc_java.sec08.chap04;

import yalc_java.sec07.chap04.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> numNameHMap = new HashMap<>();
        //  💡 put 메소드를 사용하여 키와 값 삽입
        numNameHMap.put(1, "홍길동");
        numNameHMap.put(2, "전우치");
        numNameHMap.put(3, "임꺽정");

        Map<String, Double> nameHeightHMap = new HashMap<>();
        nameHeightHMap.put("김철수", 176.8);
        nameHeightHMap.put("이장신", 187.4);
        nameHeightHMap.put("박숏달", 152.3);
        nameHeightHMap.put("정기준", 171.2);

        Map<Side, ArrayList<Unit>> sideUnitsHMap = new HashMap<>();
        sideUnitsHMap.put(
                Side.BLUE,
                new ArrayList<>(
                        Arrays.asList(
                                new Swordman(Side.BLUE),
                                new Knight(Side.BLUE),
                                new MagicKnight(Side.BLUE))
                )
        );
        sideUnitsHMap.put(
                Side.RED,
                new ArrayList<>(
                        Arrays.asList(
                                new Knight(Side.RED),
                                new Knight(Side.RED),
                                new Knight(Side.RED))
                )
        );

        //  💡 putAll : 대상 맵으로부터 전부 가져옴
        Map<Integer, String> numNameHMapClone = new HashMap<>();
        numNameHMapClone.putAll(numNameHMap);

        //  💡 get 메소드에 키를 넣어 값 접근
        String no2 = numNameHMap.get(2);
        Double leeHeight = nameHeightHMap.get("이장신");
        //  ⚠️ [잘못된 키] [입력시] [null 반환]
        // get()은 Object를 받기 때문에, 자료형에 상관없이 받은 인자의 값이 key에 없으면  -> [null] 반환
        String wrong1 = numNameHMap.get(0);
        Double wrong2 = nameHeightHMap.get(3);

        // Map컬렉션의 key들은 -> Set 컬렉션으로 저장이 되어있다...!!!
        //  💡 [keySet] [메소드] - 키들의 Set(인터페이스) 반환
        Set<Integer> numSet = numNameHMap.keySet();
        Set<Integer> numHSet = new HashSet<>();
        numHSet.addAll(numSet);

        //  keySet을 활용한 for-each
        for (Integer n : numNameHMap.keySet()) {
            System.out.println(numNameHMap.get(n));
        }
        for (Side side : sideUnitsHMap.keySet()) {
            for (Unit unit : sideUnitsHMap.get(side)) {
                System.out.println(unit);
            }
        }

        // 💡 containsKey / containsValue : 키 / 값 포함되는 쌍 있는지 확인
        boolean contains1 = nameHeightHMap.containsKey("박숏달");
        boolean contains2 = nameHeightHMap.containsKey("장롱달");
        boolean contains3 = nameHeightHMap.containsValue(171.2);

        System.out.printf("\n- - - - -\n");

        // key,value -> 모두 참조형
        Map<Attacker, Horse> atkrHrsHMap = new HashMap<>();

        Swordman kenshin = new Swordman(Side.RED);
        Knight lancelot = new Knight(Side.BLUE);

        atkrHrsHMap.put(kenshin, new Horse(40));
        atkrHrsHMap.put(lancelot, new Horse(50));
        atkrHrsHMap.put(new MagicKnight(Side.BLUE), new Horse(60)); // 마법기사는 인스턴스가 바깥에 저장되어 있지 않다

        //  ⭐️ 키의 값이 참조형일 경우 변수 등에 저장되어 있어야 함
        Horse kenshinHorse = atkrHrsHMap.get(kenshin);
        Horse lancelotHorse = atkrHrsHMap.get(lancelot);
        //  ⚠️ 일반적인 방법으로는 꺼낼 수 없음
        Horse wrongHorse = atkrHrsHMap.get(new MagicKnight(Side.BLUE));

        // keySet()으로 모든 key값을 꺼내고 그걸 for문을 이용해서 꺼내야, 저 마법기사의 말을 얻을 수 있다
        //  이런 식으로밖에 꺼낼 수 없음
        for (Attacker u : atkrHrsHMap.keySet()) {
            System.out.println(u + " : " + atkrHrsHMap.get(u));
        }

        //  💡 [getOrDefault] : 키에 해당하는 [쌍이 없을 시] [지정한 디폴트 값] [반환]
        String defName = numNameHMap.getOrDefault(10, "김대타");
        Horse defHorse = atkrHrsHMap.getOrDefault(new MagicKnight(Side.BLUE), new Horse(40));

        //  💡 [Entry 인터페이스] : 맵의 각 요소, 키와 값을 가짐
        //  - 클래스 살펴볼 것
        // entry는 getKey(), getValue()등을 가지고 있다..!
        // 즉 , 맵 안에는 여기에 속한 엔트리라는 또 다른 인터페이를 적용하는 클래스의 인스턴스로 키와 벨류가 저장되어 있다
        // 어떤 노드의 인스턴스...
        Set<Map.Entry<Integer, String>> numNameES = numNameHMap.entrySet();
        for (Map.Entry<Integer, String> entry : numNameES) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("k: %d, v: %s%n", key, value);
            System.out.println(entry);
        }

        //  remove, clear, isEmpty 메소드들

        numNameHMap.remove(1); // 주어진 키가 있다면 삭제
        numNameHMap.remove(2, "황대장"); // 주어진 키와 값의 쌍이 있다면 삭제

        boolean isEmpty1 = nameHeightHMap.isEmpty();
        nameHeightHMap.clear();
        boolean isEmpty2 = nameHeightHMap.isEmpty();

        // HashMap, TreeMap -> 키를 해쉬셋, 트리셋으로 저장하는 느낌
        // 빠른 속도 -> HashMap
        // 정렬 중요 -> TreeMap
        //  ⭐️ 키 순으로 정렬됨 확인
        TreeMap<Integer, String[]> classKidsTMap = new TreeMap<>();
        classKidsTMap.put(3, new String[] {"서아", "이준", "아린"});
        classKidsTMap.put(9, new String[] {"하윤", "서준", "지호"});
        classKidsTMap.put(1, new String[] {"이서", "하준", "아윤"});
        classKidsTMap.put(7, new String[] {"지안", "은우", "예준"});
        classKidsTMap.put(5, new String[] {"서윤", "시우", "하은"});

        //  트리 전용 메소드들
        int firstKey = classKidsTMap.firstKey();
        int lastKey = classKidsTMap.lastKey();

        // key,value의 쌍이 [엔트리 자료형으로] 반환이 되어지는 것을 볼 수 있다
        Map.Entry<Integer, String[]> firstEntry = classKidsTMap.firstEntry();
        Map.Entry<Integer, String[]> lastEntry = classKidsTMap.lastEntry();

        int ceil4 = classKidsTMap.ceilingKey(4);
        Map.Entry<Integer, String[]> floor4 = classKidsTMap.floorEntry(4);

        Map.Entry<Integer, String[]> pollF1 = classKidsTMap.pollFirstEntry();
        Map.Entry<Integer, String[]> pollF2 = classKidsTMap.pollFirstEntry();
        Map.Entry<Integer, String[]> pollL1 = classKidsTMap.pollLastEntry();
        Map.Entry<Integer, String[]> pollL2 = classKidsTMap.pollLastEntry();

    }
}

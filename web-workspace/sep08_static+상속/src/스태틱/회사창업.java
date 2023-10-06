package 스태틱;

public class 회사창업 {
    public static void main(String[] args) {
        직원 work1 = new 직원("홍길동", 25, "여");
        직원 work2 = new 직원("김길동", 24, "남");
        직원 work3 = new 직원("송길동", 26, "여");

        // 1. 우리회사의 직원수를 출력
        System.out.println("우리회사의 직원수: " + 직원.get직원수());

        // 2. 우리회사의 직원 각각의 정보를 출력
        System.out.println("직원 1 정보:");
        work1.출력();

        System.out.println("직원 2 정보:");
        work2.출력();

        System.out.println("직원 3 정보:");
        work3.출력();

        // 3. 우리회사의 직원의 평균 나이를 출력
        직원[] 직원들 = {work1, work2, work3};
        System.out.println("우리회사의 직원의 평균 나이: " + 직원.평균나이계산(직원들));
    }
}

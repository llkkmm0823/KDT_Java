package 스태틱;

	public class 직원 {
	    private static int 직원수 = 0; // 직원 수를 저장하기 위한 정적 변수
	    private String 이름; // 직원의 이름을 저장하는 인스턴스 변수
	    private int 나이; // 직원의 나이를 저장하는 인스턴스 변수
	    private String 성별; // 직원의 성별을 저장하는 인스턴스 변수

	    // 직원 객체를 생성할 때 직원 수를 증가시키고, 이름, 나이, 성별을 초기화하는 생성자
	    public 직원(String 이름, int 나이, String 성별) {
	        this.이름 = 이름;
	        this.나이 = 나이;
	        this.성별 = 성별;
	        직원수++; // 직원이 생성될 때마다 직원 수 증가
	    }

	    // 직원 수를 반환하는 정적 메서드
	    public static int get직원수() {
	        return 직원수;
	    }

	    // 직원 정보를 출력하는 메서드
	    public void 출력() {
	        System.out.println("이름: " + 이름);
	        System.out.println("나이: " + 나이);
	        System.out.println("성별: " + 성별);
	    }

	    // 직원의 평균 나이를 계산하는 정적 메서드
	    public static double 평균나이계산(직원[] 직원들) {
	        int 총나이 = 0;
	        for (직원 직원 : 직원들) {
	            총나이 += 직원.나이;
	        }
	        return (double) 총나이 / 직원수;
	    }
	}


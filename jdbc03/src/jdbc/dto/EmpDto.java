package jdbc.dto;

public class EmpDto {
	//필드 - DB의 컬럼명을 작성
		private int empNo;
		private String empName;
		private String empDept;
		private String empDate;
		private int empSal;
		//필드를 만들고 추가로 setter/getter/기본생성자를 구현
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpDept() {
			return empDept;
		}
		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}
		public String getEmpDate() {
			return empDate;
		}
		public void setEmpDate(String empDate) {
			this.empDate = empDate;
		}
		public int getEmpSal() {
			return empSal;
		}
		public void setEmpSal(int empSal) {
			this.empSal = empSal;
		}
		public EmpDto() {
			super();
		}
		@Override
		public String toString() {
			return "EmpDto [empNo=" + empNo + ", empName=" + empName + ", empDept=" + empDept + ", empDate=" + empDate
					+ ", empSal=" + empSal + "]";
		}
		
		
}
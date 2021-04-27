class A {
	public static void main(String[] args) {
		int result = B.findCube(9);		
		System.out.println("value = "+result);
	}
}

class B {
	public static int findCube(int n) {
		System.out.println("findCube");
		return n*n*n;
	}
}
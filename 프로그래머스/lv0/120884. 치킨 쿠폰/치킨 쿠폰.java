class Solution {
	public int solution(int chicken) {
		int answer = 0;
		int serviceChicken = 0;
		int restCoupon = chicken;
		while (restCoupon >= 10) {
			int newService = restCoupon/10;
			restCoupon -= newService * 10;
			serviceChicken += newService;
			restCoupon += newService;
		}
		answer = serviceChicken;

		return answer;
	}
}
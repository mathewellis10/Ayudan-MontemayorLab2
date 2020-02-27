package com.foundation;

	public class facePowder extends foundation{
		private String powderType;
		
		public facePowder(String makeup, String packaging, int grams, String powderType) {
			super(makeup, packaging, grams);
			this.powderType = powderType;
		}

		public String getPowderType() {
			return powderType;
		}

		public void setPowderType(String powderType) {
			this.powderType = powderType;
		}

		public void spf(int spf) {
			System.out.println("It has 50 spf");
		}
		
		public void coverage(String coverage, int stayingPower) {
			System.out.println("It is " + coverage + " coverage");
			System.out.println("It can stay up to " + stayingPower + " hours");
		}
		
		public void shade(String shade) {
			System.out.println("It is in " + shade + " shade" + "\n");
		}
}

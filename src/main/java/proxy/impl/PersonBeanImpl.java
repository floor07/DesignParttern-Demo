package proxy.impl;


import proxy.PersonBean;

public class PersonBeanImpl implements PersonBean{
	
	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount=0;
	
	public String getName() {
		return this.name;
	}

	public String getGender() {
		return this.gender;
	}

	public String getInterests() {
		return this.interests;
	}

	public int getHotOrNotRating() {
		return this.ratingCount==0?0:(rating/ratingCount);
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setGender(String gender) {
		this.gender=gender;
	}

	public void setHotOrNotRating(int rating) {
		this.rating+=rating;
		ratingCount++;
	}

	public void setInterests(String interests) {
		this.interests=interests;
	}

	@Override
	public String toString() {
		return "PersonBeanImpl [name=" + name + ", gender=" + gender + ", interests=" + interests + ", rating=" + rating
				+ ", ratingCount=" + ratingCount + "]";
	}

}

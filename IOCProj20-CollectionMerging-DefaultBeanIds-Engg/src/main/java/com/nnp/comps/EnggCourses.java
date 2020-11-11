package com.nnp.comps;

import java.util.Set;

public class EnggCourses {
	private Set<String> subjects;

		public EnggCourses(Set<String> subjects) {
			super();
			this.subjects = subjects;
		}
	
	
	/*	public void setSubjects(Set<String> subjects) {
			this.subjects = subjects;
		}*/
	
	@Override
	public String toString() {
		return "EnggCourses [subjects=" + subjects + "]";
	}


}

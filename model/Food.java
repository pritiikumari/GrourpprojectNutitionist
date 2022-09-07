package com.stackroute.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table (name="Food")
	public class Food {
		@Id
		@Column(name="id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String fname;
		private String ndbno;
		private String description;
		
		public Food() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Food(int id, String fname, String ndbno, String description) {
			super();
			this.id = id;
			this.fname = fname;
			this.ndbno = ndbno;
			this.description = description;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getNdbno() {
			return ndbno;
		}

		public void setNdbno(String ndbno) {
			this.ndbno = ndbno;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Food [id=" + id + ", fname=" + fname + ", ndbno=" + ndbno + ", description=" + description + "]";
		}
}
package pojos;

public class BookingPojo {

	//1)Create "private" variables for every key of Json Data
	
		private String firstname;
		private String lastname;
		private int totalprice;
		private boolean  depositpaid;
		private BookingDatesPojo bookingdates;
		
		
		
		
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public int getTotalprice() {
			return totalprice;
		}
		public void setTotalprice(int totalprice) {
			this.totalprice = totalprice;
		}
		public boolean isDepositpaid() {
			return depositpaid;
		}
		public void setDepositpaid(boolean depositpaid) {
			this.depositpaid = depositpaid;
		}
		public BookingDatesPojo getBookingdates() {
			return bookingdates;
		}
		public void setBookingdates(BookingDatesPojo bookingdates) {
			this.bookingdates = bookingdates;
		}
		
		
		
		
		public BookingPojo() {
			
		}
		public BookingPojo(String firstname, String lastname, int totalprice, boolean depositpaid,
				BookingDatesPojo bookingdates) {
			
			this.firstname = firstname;
			this.lastname = lastname;
			this.totalprice = totalprice;
			this.depositpaid = depositpaid;
			this.bookingdates = bookingdates;
		}
		
		
		
		
		@Override
		public String toString() {
			return "bookingPojo [firstname=" + firstname + ", lastname=" + lastname + ", totalprice=" + totalprice
					+ ", depositpaid=" + depositpaid + ", bookingdates=" + bookingdates + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
		
}

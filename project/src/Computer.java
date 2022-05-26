public class Computer {

   String m_ip_address;
   String m_value;

   public Computer() {
      this.m_ip_address = "";
      this.m_value = "";
   }

   public Computer(String ip_address, String value) {
      this.m_ip_address = ip_address;
      this.m_value = value;
   }

   public String GetValue() {
      return this.m_value;
   }

   public String GetIPAddress() {
      return this.m_ip_address;
   }

   @Override
   public String toString() {
      return "Address:\t" + GetIPAddress() + "\n"
            + "Value:\t" + GetValue() + "\n";
   }
}
public class Computer {

   String m_ip_address;
   String m_value;

   public Computer() {
      SetIPAddress("");
      SetValue("");
   }

   public Computer(String ip_address, String value) {
      SetIPAddress(ip_address);
      SetValue(value);
   }

   private void SetValue(String value) {
      this.m_value = value;
   }

   private void SetIPAddress(String ip_address) {
      this.m_ip_address = ip_address;
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
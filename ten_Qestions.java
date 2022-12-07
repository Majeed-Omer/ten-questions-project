import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.concurrent.TimeUnit;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ten_Qestions{
static String a = "";
static String b = "";
static String c = "";
static String d = "";
static String e = "";
static String f = "";
static String g = "";
static String h = "";
static String i = "";
static String j = "";
static int point = 0;
public static void main(String args[])throws InterruptedException{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton("a");
JButton button2 = new JButton("b");
JButton button3 = new JButton("c");
JTextField tf1 = new JTextField("1 - Binary number to 10?");
tf1.setFont(new Font("Binary number to 10?", Font.BOLD, 15));
JTextField tf2 = new JTextField("(a)[100],   (b)[1010],   (c)[1011]");
tf2.setFont(new Font("(a)[100],   (b)[1010],   (c)[1011]", Font.BOLD, 15));
JTextField tf3 = new JTextField();
int count = 0;
tf1.setBounds(10, 30, 410, 50);
tf2.setBounds(10, 90, 378, 50);
tf3.setBounds(390, 90, 30, 50);
button1.setBounds(10, 150, 50, 50);
button2.setBounds(70, 150, 50, 50);
button3.setBounds(130, 150, 50, 50);
panel.add(tf1);
panel.add(tf2);
panel.add(tf3);
panel.add(button1);
panel.add(button2);
panel.add(button3);
frame.add(panel);
panel.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
frame.setSize(500, 500);
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
		a = "100";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
		a = "1010";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
		a = "1011";
}
});
for(int i=0;; i++){
	TimeUnit.SECONDS.sleep(1);
    count++;
    String c1 = String.valueOf(count);
    tf3.setFont(new Font(c1, Font.BOLD, 15));
    tf3.setText(c1);
    if(a.equals("1010"))
    {
		tf2.setFont(new Font("Correct!", Font.BOLD, 15));
		tf2.setText("Correct!");
		tf2.setBackground(Color.green);
		point++;
		break;
	}
	else if(a.equals("1011"))
	{
		tf2.setFont(new Font("Wrong!", Font.BOLD, 15));
		tf2.setText("Wrong!");
		tf2.setBackground(Color.red);
		break;
	}
	else if(a.equals("100"))
	{
		tf2.setFont(new Font("Wrong!", Font.BOLD, 15));
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
if(count==10)
{
	tf2.setFont(new Font("Time out!", Font.BOLD, 15));
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.white);
tf1.setText("2 - Which animal can't jump?");
tf2.setText("(a)[elephant],  (b)[chicken],  (c)[cat]");
count = 0;
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
		b = "elephant";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
		b = "chicken";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
		b = "cat";
}
});
for(int i=0;; i++){
	TimeUnit.SECONDS.sleep(1);
    count++;
    String c1 = String.valueOf(count);
    tf3.setFont(new Font(c1, Font.BOLD, 15));
    tf3.setText(c1);
    if(b.equals("elephant"))
    {
		tf2.setText("Correct!");
		tf2.setBackground(Color.GREEN);
		point++;
		break;
	}
	else if(b.equals("chicken"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(b.equals("cat"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
if(count==10)
{
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.WHITE);
tf1.setText("3 - How many days in a year?");
tf2.setText("(a)[356],  (b)[360],  (c)[365]");
count = 0;
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	c = "356";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	c = "360";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	c = "365";
}
});
for(int i=0;;i++){
	TimeUnit.SECONDS.sleep(1);
	count++;
	String c1 = String.valueOf(count);
	tf3.setText(c1);
	if(c.equals("365"))
	{
		tf2.setText("Correct!");
		tf2.setBackground(Color.GREEN);
		point++;
		break;
	}
	else if(c.equals("360"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(c.equals("356"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
if(count==10)
{
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.white);
tf1.setText("4 - Which language use to make apps on android?");
tf2.setText("(a)[java],  (b)[c++],  (c)[python]");
count = 0;
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	d = "java";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	d = "c++";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	d = "python";
}
});
while(true){
	TimeUnit.SECONDS.sleep(1);
	count++;
	String c1 = String.valueOf(count);
	tf3.setText(c1);
	if(d.equals("java"))
	{
		tf2.setText("Correct!");
		tf2.setBackground(Color.GREEN);
		point++;
		break;
	}
	else if(d.equals("c++"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(d.equals("python"))
	{
		tf2.setText("Wrong");
		tf2.setBackground(Color.RED);
		break;
	}
if(count==10)
{
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.white);
tf1.setText("5 - What's name of prophet of religion Islam?");
tf2.setText("(a)[Muhamad],  (b)[Ahmad],  (c)[Both of them]");
count = 0;
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e1){
	e = "Muhamad";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e1){
	e = "Ahamad";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e1){
	e = "Both of them";
}
});
while(true){
	TimeUnit.SECONDS.sleep(1);
	count++;
	String c1 = String.valueOf(count);
	tf3.setText(c1);
	if(e.equals("Muhamad"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(e.equals("Ahamad"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(e.equals("Both of them"))
	{
		tf2.setText("Correct!");
		tf2.setBackground(Color.GREEN);
		point++;
		break;
	}
if(count==10)
{
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.white);
tf1.setText("6 - How many days a person can survive without water?");
tf2.setText("(a)[12 days],  (b)[7 days],  (c)[10 days]");
count = 0;
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	f = "12 days";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	f = "7 days";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	f = "10 days";
}
});
while(true)
{
	TimeUnit.SECONDS.sleep(1);
	count++;
	String c1 = String.valueOf(count);
	tf3.setText(c1);
	if(f.equals("12 days"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(f.equals("7 days"))
	{
		tf2.setText("Correct!");
		tf2.setBackground(Color.GREEN);
		point++;
		break;
	}
	else if(f.equals("10 days!"))
	{
		tf2.setText("Wrong");
		tf2.setBackground(Color.RED);
		break;
	}
if(count==10)
{
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.white);
tf1.setText("7 - (6 % 4 + 3 * 2) = ?");
tf2.setText("(a)[9],  (b)[8],  (c)[10]");
count = 0;
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	g = "9";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	g = "8";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	g = "10";
}
});
while(true)
{
	TimeUnit.SECONDS.sleep(1);
	count++;
	String c1 = String.valueOf(count);
	tf3.setText(c1);
	if(g.equals("10"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(g.equals("8"))
	{
		tf2.setText("Correct!");
		tf2.setBackground(Color.GREEN);
		point++;
		break;
	}
	else if(g.equals("9"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
if(count==10)
{
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.WHITE);
tf1.setText("8 - Which palnet has most of moon?");
tf2.setText("(a)[zuhal],  (b)[mercury],  (c)[pluto]");
count = 0;
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	h = "zuhal";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	h = "mercury";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	h = "pluto";
}
});
while(true)
{
	TimeUnit.SECONDS.sleep(1);
	count++;
	String c1 = String.valueOf(count);
	tf3.setText(c1);
	if(h.equals("zuhal"))
	{
		tf2.setText("Correct!");
		tf2.setBackground(Color.GREEN);
		point++;
		break;
	}
	else if(h.equals("mercury"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(h.equals("pluto"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
if(count==10)
{
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.WHITE);
tf1.setText("9 - what is largest country in the world?");
tf2.setText("(a)[Spain],  (b)[Germany],  (c)[Russia]");
count = 0;
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	i = "Spain";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	i = "Germany";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	i = "Russia";
}
});
while(true)
{
	TimeUnit.SECONDS.sleep(1);
	count++;
	String c1 = String.valueOf(count);
	tf3.setText(c1);
	if(i.equals("Spain"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(i.equals("Germany"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(i.equals("Russia"))
	{
		tf2.setText("Correct!");
		tf2.setBackground(Color.GREEN);
		point++;
		break;
	}
if(count==10)
{
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.WHITE);
tf1.setText("10 - Who invented basketball?");
tf2.setText("(a)[James Naismith],  (b)[Walter Camp],  (c)[Thoms]");
count = 0;
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	j = "James Naismith";
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	j = "Walter Camp";
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	j = "Thoms";
}
});
while(true)
{
	TimeUnit.SECONDS.sleep(1);
	count++;
	String c1 = String.valueOf(count);
	tf3.setText(c1);
	if(j.equals("Thoms"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(j.equals("Walter Camp"))
	{
		tf2.setText("Wrong!");
		tf2.setBackground(Color.RED);
		break;
	}
	else if(j.equals("James Naismith"))
	{
		tf2.setText("Correct!");
		tf2.setBackground(Color.GREEN);
		point++;
		break;
	}
if(count==10)
{
	tf2.setText("Time out!");
	break;
}
}
TimeUnit.SECONDS.sleep(3);
tf2.setBackground(Color.WHITE);
tf3.setText("");
tf1.setText("RESULT");
tf2.setText("You get " + point + "/10 qestions");
}
}
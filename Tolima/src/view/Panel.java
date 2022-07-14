package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


public class Panel  extends JPanel{
	
	private JPanel header, languaje, carousel, menu,body, redes,sourse;
	private Fondo panel1, panel2, panel3;
	private JLabel icon, iconEs, iconEn, iconFr, pic, img1, img2, img3, logoMenu, facebook, twiter, play2, gmail, soat; 
	private JFrame slider;
	private Timer tm;
    private int x;
    private JButton play, services, chat, state, report, tolima;
    private TimerTask task;
    private GridBagConstraints gbc;
    private Image image1, image2, image3;
    private JComboBox services2, chat2, state2, tolima2;
    private JScrollPane scroll;

	public Panel(ActionListener listener) {
		initComponents(listener);
	}

	private void initJPanel() {
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		
		header = new JPanel();
		header.setBackground(new Color(51,102,204));
		header.setLayout( new BorderLayout());
		add(header, BorderLayout.NORTH);
		
		languaje = new JPanel();
		languaje.setBackground(header.getBackground());
		header.add(languaje, BorderLayout.EAST);
		
		body = new JPanel();
		
		
		carousel = new JPanel();
		carousel.setLayout(new CardLayout());
		JScrollPane scroll = new JScrollPane();
		//scroll.setBounds(5000, 5000, 500, 500);
		carousel.setPreferredSize(new Dimension(1380,800));
		body.add(carousel);
		
		scroll.setViewportView(body);
		add(scroll, BorderLayout.CENTER);
		

		menu = new JPanel();
		menu.setOpaque(false);
		redes = new JPanel();
		redes.setOpaque(false);
		redes.setLayout(new BoxLayout(redes,BoxLayout.Y_AXIS));
		redes.setBorder(new EmptyBorder(0,0,0,30));
		
		panel1 = new Fondo("gobernador_tolima_ricardo_orozco_selfie.jpg");
		panel1.setLayout(new BorderLayout());
		panel2 = new Fondo("slider-bandera.jpg");
		panel2.setLayout(new BorderLayout());
		panel3 = new Fondo("slider-nina.jpg");
		panel3.setLayout(new BorderLayout());
		
		sourse = new JPanel();
		sourse.setLayout(new BoxLayout(redes,BoxLayout.X_AXIS));
		
	}

	
	private void initComponents(ActionListener listener) {
		
		this.setLayout(new BorderLayout());
		initJPanel();
		
		icon = new JLabel("");
		icon.setIcon(new ImageIcon("data/header/govco.png"));
		icon.setBorder(new EmptyBorder(0,30,5,0));
		header.add(icon, BorderLayout.WEST);
		
		iconFr = new JLabel("");
		iconFr.setIcon(new ImageIcon("data/header/fr.png"));
		languaje.add(iconFr);
		iconEn = new JLabel("");
		iconEn.setIcon(new ImageIcon("data/header/en.png"));
		languaje.add(iconEn);
		iconEs = new JLabel("");
		iconEs.setIcon(new ImageIcon("data/header/es.png"));
		iconEs.setBorder(new EmptyBorder(0,0,0,30));
		languaje.add(iconEs);
		
		img1 = new JLabel("");
		//img1.setIcon(new ImageIcon("data/carousel/gobernador_tolima_ricardo_orozco_selfie.jpg"));
		
		carousel.add(panel1, "1");
		img2 = new JLabel("");
		//img2.setIcon(new ImageIcon("data/carousel/slider-bandera.jpg"));
		img2.setMinimumSize(this.getMaximumSize());
		carousel.add(panel2, "2");
		img3 = new JLabel("");
		//img3.setIcon(new ImageIcon("data/carousel/slider-nina.jpg"));
		panel1.add(img1, BorderLayout.CENTER);
		panel2.add(img2, BorderLayout.CENTER);
		panel3.add(img3, BorderLayout.CENTER);
		carousel.add(panel3, "3");
		
		CardLayout cl = (CardLayout)(carousel.getLayout());
		
		x = 1;
		tm = new Timer();
		task = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				switch(x) {
				case 1:
					panel1.add(menu,BorderLayout.NORTH);
					panel1.add(redes,BorderLayout.EAST);
					panel1.add(search,BorderLayout.EAST);
					break;
				case 2:
					panel2.add(menu,BorderLayout.NORTH);
					panel2.add(redes,BorderLayout.EAST);
					break;
				case 3:
					panel3.add(menu,BorderLayout.NORTH);;
					panel3.add(redes,BorderLayout.EAST);
					break;
				case 4:
					x = 1;
					panel1.add(menu,BorderLayout.NORTH);
					panel1.add(redes,BorderLayout.EAST);
					break;
				}
				cl.show(carousel, String.valueOf(x));
				x++;
				
			}
			
		};
		tm.schedule(task, 0, 5000);
		
		
		
		logoMenu = new JLabel();
		logoMenu.setIcon(new ImageIcon("data/carousel/logo_blanco.png"));
		logoMenu.setBackground(new Color(141,15,34));
		menu.add(logoMenu);
		
		play = new JButton("INICIO");
		menu.add(play);
		String[] servicesList = {"TRAMITES Y SERVICIOS", "Certificado", "Pasaporte", "Salud", "Sistema Humano",
				"Aplicativos en Linea" };
		String[] chatList = {"TRAMITES Y SERVICIOS", "Informacion", "Participacion", "Interes General", 
				"Informacion Publica", "Aplicativos en Linea" };
		String[] stateList = {"GOBERNACIÓN", "Nosotros", "Contratación", "Nuesta Gestion, gobernador", "Entidades"};
		String[] tolimaList = {"TOLIMA", "Cifras y Estadisticas", "Informes municipales" };
		services = new JButton("TRAMITES Y SERVICOS");
		services2 = new JComboBox(servicesList);
		chat2 = new JComboBox(chatList);
		state2 = new JComboBox(stateList); 
		tolima2 = new JComboBox(tolimaList);
		
		menu.add(services2);
		chat = new JButton("ATENCIÓN AL CIUDADANO");
		menu.add(chat2);
		state = new JButton("GOBERNACIÓN");
		menu.add(state2);
		report = new JButton("TRANSPARENCIA");
		menu.add(report);
		tolima = new JButton("TOLIMA");
		menu.add(tolima2);
		
		facebook = new JLabel();
		facebook.setIcon(new ImageIcon(new ImageIcon("data/carousel/logo_facebook.png").getImage().getScaledInstance(80, 
				80, Image.SCALE_DEFAULT)));
		redes.add(facebook);
		twiter = new JLabel();
		twiter.setIcon(new ImageIcon(new ImageIcon("data/carousel/twitter.png").getImage().getScaledInstance(80, 
				80, Image.SCALE_DEFAULT)));
		redes.add(twiter);
		play2 = new JLabel();
		play2.setIcon(new ImageIcon(new ImageIcon("data/carousel/play-logo.png").getImage().getScaledInstance(80, 
				80, Image.SCALE_DEFAULT)));
		redes.add(play2);
		gmail = new JLabel();
		gmail.setIcon(new ImageIcon(new ImageIcon("data/carousel/logo_gmail.png").getImage().getScaledInstance(80, 
				80, Image.SCALE_DEFAULT)));
		redes.add(gmail);
		soat = new JLabel();
		soat.setIcon(new ImageIcon(new ImageIcon("data/carousel/veiculo.png").getImage().getScaledInstance(100, 
				150, Image.SCALE_DEFAULT)));
		
		redes.add(soat);
		
	}

	
	
}

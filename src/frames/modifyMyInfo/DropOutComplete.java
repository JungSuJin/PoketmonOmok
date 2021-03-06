package frames.modifyMyInfo;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import enums.frames.CorrectEnum;
import enums.frames.SearchIDEnum;

//ENUM�� correctEnum �� Ż��Ϸ� �������� ���ٰ� �״�ξ�

@SuppressWarnings("serial")
public class DropOutComplete extends JFrame{
	private Image backGround;
	private JLabel dropOutCompleteLabel;
	private JButton confirm;
	
	public DropOutComplete() throws IOException {
		this.backGround = ImageIO.read(new File("resources/background/popup.png")).getScaledInstance(
				CorrectEnum.CORRECT_COMPLETE_FRAME_SIZE_RECT.getRect().width,
				CorrectEnum.CORRECT_COMPLETE_FRAME_SIZE_RECT.getRect().height,
                Image.SCALE_SMOOTH);

		this.setContentPane(new JLabel(new ImageIcon(backGround)));
		
		this.setBounds(CorrectEnum.DROPOUT_FRAME_SIZE_RECT.getRect());
		
		this.dropOutCompleteLabel = new JLabel("Ż�� �Ϸ�");
		this.dropOutCompleteLabel.setFont(SearchIDEnum.LABELFONT_DEFAULT.getFont());
		this.dropOutCompleteLabel.setBounds(CorrectEnum.DROPOUT_COMPLETE_TEXT_SIZE_RECT.getRect());
		
		this.confirm = new JButton() {
			@Override
            protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				try {
					g.drawImage(ImageIO.read(
						new File("resources/myData/confirm.kor.png")), 
						0, 
						0, 
						CorrectEnum.DROPOUT_COMPLETE_BUTTON_SIZE_RECT.getRect().width,
						CorrectEnum.DROPOUT_COMPLETE_BUTTON_SIZE_RECT.getRect().height,
						this);
				} catch (IOException e) {
					e.printStackTrace();
	            }      
	        }	
		};
		this.confirm.setFocusPainted(false);
		this.confirm.setBorderPainted(false);
		this.confirm.setContentAreaFilled(false);
		this.confirm.setBounds(CorrectEnum.DROPOUT_COMPLETE_BUTTON_SIZE_RECT.getRect());
		
		this.add(dropOutCompleteLabel);
		this.add(confirm);
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
		
	}
}

private class ColorAction implements ActionListener{//��������� ��������� ���������� �� �������
public ColorAction(Color c ){//����������� �������� ���� � �������� ���������
backgroundColor=c;
s=c.toString();

}
public void actionPerformed(ActionEvent event){//������� �� ������� ������-����� ����� ������
setBackground(backgroundColor);
textField.setText(s);
textArea.append(s+ "\n");
}
private Color backgroundColor;
private String  s;

}

}
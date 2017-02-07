private class ColorAction implements ActionListener{//реализуем интерфейс отвечающий за события
public ColorAction(Color c ){//конструктор получает цвет в качестве параметра
backgroundColor=c;
s=c.toString();

}
public void actionPerformed(ActionEvent event){//реакция на нажатие кнопки-смена цвета панели
setBackground(backgroundColor);
textField.setText(s);
textArea.append(s+ "\n");
}
private Color backgroundColor;
private String  s;

}

}
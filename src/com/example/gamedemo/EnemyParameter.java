package com.example.gamedemo;

import com.badlogic.gdx.math.Rectangle;

public class EnemyParameter {
	Rectangle rectangle = new Rectangle();
	boolean isover; // �Ƿ��Ѿ��ҵ�
	int Type; // �������
	int AttackValue; // ����ֵ
	int Health;// ����ֵ
	float df; // �ҵ�֮����ʧʱ��
	float OverTime; // �ҵ�ʱ��
	boolean isHit=false; // �Ƿ񱻴���
	public EnemyParameter() {
		// TODO Auto-generated constructor stub
	}

	public void set(int x, int y, int W, int H, int Type, int AttackValue,
			int Health) {
		// TODO Auto-generated constructor stub
		rectangle.x = x;
		rectangle.y = y;
		rectangle.width = W;
		rectangle.height = H;
		this.Type = Type;
		this.AttackValue = AttackValue;
		this.Health = Health;
	}

}
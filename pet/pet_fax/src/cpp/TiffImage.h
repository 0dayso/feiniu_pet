#pragma once
#include <string>

class TiffImage
{
	enum{WIDTH=794,HEIGHT=1123,SPACE=20};
public:
	TiffImage(const std::string& filename);
	~TiffImage(void);
	//ת�����ŵ�ͼƬ
	void converVertical();
	//���ŵ�ͼƬ(��Ʊʹ��)
	void converHorizontal();

	std::string targetPath();



private:
	std::string m_filename;
	long m_type;
	std::string m_target_file;


	
};


SELECT '"' || '�Ƿ������¼' || '","' || 
              '����' || '","' || 
              '��ϵ��ʽ' || '","' ||
              '��ע' || '","' || 
              '������' || '","'|| 
              '����ʱ��' || '","'|| 
              '���ʱ��' || '","'|| 
              '������' || '","'|| 
              'Ŀ�ĵ�' || '","'|| 
              '��������' || '","'|| 
              '����' || '","'|| 
              '��Ʒid' || '","'|| 
              '��Ʒ����' || '","'|| 
              'ҵ������' || '","'|| 
              '��������' || '","'|| 
              '����������' || '"'    
  FROM DUAL
 WHERE ROWNUM = 1
UNION ALL
 SELECT DISTINCT '"' || TO_CHAR(CALL_BACK) || '","' ||
                TO_CHAR(FEEDBACK_TIME,'yyyy-MM-dd hh24:mi:ss') || '","' || 
                TO_CHAR(MOBILE) || '","' ||
                TO_CHAR(MEMO) || '","' ||
                TO_CHAR(OPERATOR_USER_ID) || '","'||
                TO_CHAR(visit_time)||'","'||
                TO_CHAR(visit_time)||'","'||
                TO_CHAR(from_place_name)||'","'||
                TO_CHAR(to_place_name)||'","'||
                TO_CHAR(day)||'","'||
                TO_CHAR(quantity)||'","'||
                TO_CHAR(product_id)||'","'||
                TO_CHAR(product_zone)||'","'||
                TO_CHAR(business_type)||'","'||
                TO_CHAR(service_type)||'","'||
                TO_CHAR(sub_service_type)||'"'
      FROM lvmama_pet.conn_record

 
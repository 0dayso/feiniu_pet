select '"'||
'��Ʒ����'||'","'||
'��Ʒ������'||'","'||
'������'||'","'||
'�Ӷ�����'||'","'||
'������Դ����'||'","'||
'����ʱ��'||'","'||
'�״���ʱ��'||'","'||
'����ʱ��'||'","'||
'����ʱ��'||'","'||
'����״̬'||'","'||
'֧��״̬'||'","'||
'֧��ʱ��'||'","'||
'֧������'||'","'||
'Ԥ��Ȩ״̬'||'","'||
'pos���̻�����'||'","'||
'�ڲ����׺�'||'","'||
'�ⲿ���׺�'||'","'||
'������ˮ��'||'","'||
'��������'||'","'||
'���۲�Ʒ����'||'","'||
'���۲�ƷID '||'","'||
'�ɲ�Ʒ����'||'","'||
'�ɹ���ƷID'||'","'||
'ƾ֤��������'||'","'||
'�����������'||'","'||
'��Ӧ������'||'","'||
'��Ӧ��ID'||'","'||
'�ҷ����㹫˾'||'","'||
'�����ֹ�˾'||'","'||
'��������'||'","'||
'�ɹ�����'||'","'||
'��������'||'","'||
'��ͯ����'||'","'||
'������Ʒ���'||'","'||
'�����Żݽ��'||'","'||
'����������'||'","'||
'����Ӧ�ս��'||'","'||
'�Ӷ������ۼ�'||'","'||
'�Ӷ������'||'","'||
'�Ӷ��������ܼ�'||'","'||
'�ɹ���Ʒʵ�ս��'||'","'||
'ʵ���ܽ��'||'","'||
'���㵥��'||'","'||
'�����ܼ�'||'","'||
'������ñ仯'||'","'||
'ʵ�ʽ��㵥��'||'","'||
'ʵ�ʽ����ܼ�'||'","'||
'�˿���'||'","'||
'�˿�����'||'","'||
'�˿�����'||'","'||
'�������'||'","'||
'��������'||'","'||
'ʣ����'||'","'||
'֧������'||'","'||
'Ԥ����ʽ'||'","'||
'�û���'||'","'||
'��������'||'","'||
'���������'||'","'||
'��Ϣ�����'||'","'||
'���ֵ���'||'","'||
'��Դ�����'||'","'||
'��ϵ��'||'","'||
'�ֻ���'||'","'||
'�û��ʺŵ�ַ'||'","'||
'������ע'||'","'||
'��̨�ͷ��µ���Ա'||'","'||
'������ϵ��ַ'||'","'||
'������'||'","'||
'�����ʺ���'||'","'||
'�����ʺ�'||'","'||
'֧��������'||'","'||
'֧�����ʺ�'||'","'||
'�ź�'||'","'||
'���۲�Ʒ�ҷ���������'||'","'||
'ȡ��ԭ��'||'","'||
'֧��ת��ԭ������'||'","'||
'֧��ת���¶�����'||'","'||
'��Ӷ��'||'","'||
'��Ӷ���'||'"'
from report_detail_tv  where rownum=1 union all
select '"'||product_type_zh||'","'||
SUB_PRODUCT_TYPE_ZH||'","'||
to_char(order_id)||'","'||
to_char(order_item_prod_id)||'","'||
channel_zh||'","'||
to_char(create_time,'yyyy-mm-dd hh24:mi:ss')||'","'||
to_char(deal_time,'yyyy-mm-dd hh24:mi:ss')||'","'||
to_char(visit_time,'yyyy-mm-dd')||'","'||
to_char(max_send_time,'yyyy-mm-dd hh24:mi:ss')||'","'||
order_status_zh||'","'||
payment_status_zh ||'","'||
to_char(payment_time,'yyyy-mm-dd hh24:mi:ss')||'","'||
payment_gateway_zh||'","'''||
pay_pre_status||'","'''||
commercial_name||'","'''||
serial||'","'''||
gateway_trade_no||'","'||
payment_trade_no||'","'||
settlement_period||'","'||
replace(product_name,'"','')||'","'||
product_id  ||'","'||
replace(meta_product_name,'"','')||'","'||
meta_product_id  ||'","'||
certificat_ename||'","'||
settlement_name||'","'||
supplier_name||'","'||
supplier_id ||'","'||
supplier_id_zh||'","'||
filiale_name_zh||'","'||
to_char(quantity)||'","'||
to_char(product_quantity)||'","'||
to_char(adult_quantity)||'","'||
to_char(child_quantity)||'","'||
to_char(order_pay)||'","'||
to_char(sum_youhui_amount)||'","'||
to_char(adjustment_amount)||'","'||
to_char(ought_pay)||'","'||
to_char(price_unit)||'","'||
to_char(item_pay)||'","'||
to_char(product_settlement_price)||'","'||
to_char(item_payed_amount)||'","'||
to_char(actual_pay)||'","'||
to_char(actual_settlement_price)||'","'||
to_char(actual_settlement_price*product_quantity)||'","'||
to_char(total_pay_amount-actual_settlement_price*product_quantity)||'","'||
to_char(real_item_price)||'","'||
to_char(total_pay_amount)||'","'||
to_char(sum_order_refund_amount)||'","'||
to_char(refund_channel)||'","'||
to_char(refund_time,'yyyy-mm-dd')||'","'||
to_char(sum_compensation_amount)||'","'||
to_char(compensation_channel)||'","'||
to_char(last_price)||'","'||
payment_target_zh||'","'||
channel_zh||'","'||
user_name||'","'||
to_char(order_count)||'","'||
final_operator_name||'","'||
info_operator_name||'","'||
sub_operator_name ||'","'||
audit_operator_name ||'","'||
concat_name||'","'||
mobile||'","'||
address||'","'||
(case when length(nvl(order_memo,' '))<=1000 then replace(order_memo,'"','') else
replace(substr(order_memo,1,1000),'"','')||' ������鿴�������' end) ||'","'||
backorder_operator_name||'","'||
receivers_address||'","'||
bank_name||'","'||
bank_account_name||'","'''||
bank_account||'","'||
alipay_name||'","'||
alipay_account||'","'||
TRAVEL_GROUP_CODE||'","'||
decode(sub_product_type_zh,'����','������','����','������','����','������','����������','������','����������','������','��;������','������','��;������','������','������ʿ��','������','��;������','������','����')||'","'||
order_cancel_reason||'","'||
ori_order_id||'","'||
transfer_new_order_id||'","'||
rake_back_rate||'","'||
rake_back_price||'"'
from report_detail_tv  t
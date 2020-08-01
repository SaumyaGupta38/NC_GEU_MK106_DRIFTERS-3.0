from flask import Flask, render_template, request
import pickle
import numpy as np

model = pickle.load(open('finalized_model.sav', 'rb'))

app = Flask(__name__)


@app.route('/')
def man():
    return render_template('home.html')


@app.route('/predict', methods=['POST'])
def home():
    data1 = int(request.form['a'])
    data2 = int(request.form['b'])
    data3 = int(request.form['c'])
    data4 = int(request.form['d'])
    data5 = int(request.form['e'])
    data6 = int(request.form['f'])
    data7 = int(request.form['g'])
    data8 = int(request.form['h'])
    data9 = int(request.form['i'])
    data10= int(request.form['j'])
    data11= int(request.form['k'])
    data12= int(request.form['l'])
    data13= int(request.form['m'])
    data14= int(request.form['n'])
    data15= int(request.form['o'])
    data16= int(request.form['p'])
    data17= int(request.form['q'])
    data18= int(request.form['r'])
    data19= int(request.form['s'])
    data20= int(request.form['t'])
    data21= int(request.form['u'])
    data22= int(request.form['v'])
    data23= int(request.form['w'])
    data24= int(request.form['x'])
    
    data25= int(request.form['y'])
    data26= int(request.form['z'])
    data27= int(request.form['aa'])
    data28= int(request.form['bb'])
    data29= int(request.form['cc'])
    data30= int(request.form['dd'])
    data31= int(request.form['ee'])
    data32= int(request.form['ff'])
    data33= int(request.form['gg'])
    data34= int(request.form['hh'])
    data35= int(request.form['ii'])
    data36= int(request.form['jj'])
    data37= int(request.form['kk'])
    data38= int(request.form['ll'])
    data39= int(request.form['mm'])
    data40= int(request.form['nn'])
    data41= int(request.form['oo'])
    data42= int(request.form['pp'])
    data43= int(request.form['qq'])
    data44= int(request.form['rr'])
    data45= int(request.form['ss'])
    data46= int(request.form['tt'])
    data47= int(request.form['uu'])
    data48= int(request.form['vv'])
    data49= int(request.form['ww'])
    data50= int(request.form['xx'])
    data51= int(request.form['yy'])
    
    
    


    arr = np.array([[data1, data2, data3, data4,data5,data6,data7,data8,data9,data10,
    data11, data12, data13, data14,data15,data16,data17,data18,data19,data20,
    data21, data22, data23, data24,data25,data26,data27,data28,data29,data30,
    data31, data32, data33, data34,data35,data36,data37,data38,data39,data40,
    data41, data42, data43, data44,data45,data46,data47,data48,data49,data50,
    data51]])
    pred = model.predict(arr)
    return render_template('after.html', data=pred)

if __name__ == "__main__":
    app.run(debug=True)







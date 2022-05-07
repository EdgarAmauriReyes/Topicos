Public Class Form1
    Public conexion As SqlClient.SqlConnection
    Dim accion As String, nc As String, sql As String
    Dim res As Integer, nom As String, am As String, ap As String
    Dim com As SqlClient.SqlCommand, dr As SqlClient.SqlDataReader
    Dim da As SqlClient.SqlDataAdapter, cb As SqlClient.SqlCommandBuilder
    Dim ds As DataSet

    Public Sub conectar()
        conexion = New SqlClient.SqlConnection
        conexion.ConnectionString = ("server=DESKTOP-K9QUO6S;database=Escuela;Integrated Security= True")
        conexion.Open()

    End Sub
    Private Sub llenar_grid()
        sql = "Select * from Alumnos"
        conectar()
        da = New SqlClient.SqlDataAdapter(sql, conexion)
        cb = New SqlClient.SqlCommandBuilder(da)
        ds = New DataSet
        da.Fill(ds, "Alumnos")
        dgv.DataSource = ds
        dgv.DataMember = "Alumnos"
        conexion.Close()
    End Sub
    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        llenar_grid()
    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        accion = "GUARDAR"
        t1.Enabled = True
        t1.Text = ""
        t2.Enabled = True
        t2.Text = ""
        t3.Enabled = True
        t3.Text = ""
        t4.Enabled = True
        t4.Text = ""
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        accion = "EDITAR"
        t2.Enabled = True
        t3.Enabled = True
        t4.Enabled = True

    End Sub

    Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button3.Click
        nc = t1.Text
        nom = UCase(t2.Text)
        ap = UCase(t3.Text)
        am = UCase(t4.Text)
        sql = ""
        If accion = "GUARDAR" Then
            sql = "exec ver_alumnos '" + nc + "'"
            conectar()
            com = New SqlClient.SqlCommand(sql, conexion)
            dr = com.ExecuteReader
            If dr.Read Then
                MessageBox.Show("El número de control ya existe", "Alumnos", MessageBoxButtons.OK, MessageBoxIcon.Error)
                dr.Close()
                conexion.Close()
            Else
                sql = "exec alta_alumnos '" + nc + "','" + nom + "','" + ap + "','" + am + "'"
                conectar()
                com = New SqlClient.SqlCommand(sql, conexion)
                res = com.ExecuteNonQuery
                conexion.Close()
                MessageBox.Show("Datos guardados")
            End If
        ElseIf accion = "EDITAR" Then
            sql = "exec alta_alumnos '" + nc + "','" + nom + "','" + ap + "','" + am + "'"
            conectar()
            com = New SqlClient.SqlCommand(sql, conexion)
            res = com.ExecuteNonQuery
            conexion.Close()
            MessageBox.Show("Datos modificados")
        End If
        llenar_grid()

        t1.Enabled = False
        t2.Enabled = False
        t3.Enabled = False
        t4.Enabled = False
    End Sub
    Private Sub Button4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button4.Click
        nc = InputBox("Ingrese el número de control")
        sql = "exec ver_alumnos '" + nc + "'"
        conectar()
        com = New SqlClient.SqlCommand(sql, conexion)
        dr = com.ExecuteReader
        If dr.Read Then
            t1.Text = dr(0)
            t2.Text = dr(1)
            t3.Text = dr(2)
            t4.Text = dr(3)
        Else
            MessageBox.Show("El alumno no existe", "Alumnos")
        End If
        dr.Close()
        conexion.Close()
    End Sub

    Private Sub Button5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button5.Click
        nc = t1.Text
        res = MessageBox.Show("¿Esta seguro de eliminar al alumno?", "Alumnos", MessageBoxButtons.YesNo, MessageBoxIcon.Exclamation)
        If res = vbYes Then
            sql = "exec borrar_alumnos '" + nc + "'"
            conectar()
            com = New SqlClient.SqlCommand(sql, conexion)
            res = com.ExecuteNonQuery
            conexion.Close()
            MessageBox.Show("Alumno borrado")
        End If
        llenar_grid()

        t1.Enabled = False
        t2.Enabled = False
        t3.Enabled = False
        t4.Enabled = False
        t1.Text = ""
        t2.Text = ""
        t3.Text = ""
        t4.Text = ""
    End Sub

    Private Sub Button6_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button6.Click
        End
    End Sub

    Private Sub Label1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Label1.Click

    End Sub
End Class

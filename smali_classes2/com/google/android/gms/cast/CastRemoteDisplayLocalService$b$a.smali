.class public final Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$1;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Notification;)Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/app/Notification;)Landroid/app/Notification;

    return-object p0
.end method

.method public a(Landroid/app/PendingIntent;)Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/app/PendingIntent;)Landroid/app/PendingIntent;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Ljava/lang/String;)Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/Notification;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "notificationTitle requires using the default notification"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->c(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "notificationText requires using the default notification"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/PendingIntent;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "notificationPendingIntent requires using the default notification"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->c(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/PendingIntent;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "At least an argument must be provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Ljava/lang/String;)Ljava/lang/String;

    return-object p0
.end method

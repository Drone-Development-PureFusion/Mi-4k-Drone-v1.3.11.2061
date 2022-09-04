.class public Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/fitness/data/DataSource;

.field private b:Lcom/google/android/gms/fitness/data/DataType;

.field private c:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;)Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->a:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;)Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->b:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;)Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->c:Landroid/app/PendingIntent;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/app/PendingIntent;)Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->c:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->a:Lcom/google/android/gms/fitness/data/DataSource;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->b:Lcom/google/android/gms/fitness/data/DataType;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->a:Lcom/google/android/gms/fitness/data/DataSource;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->b:Lcom/google/android/gms/fitness/data/DataType;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "Set either dataSource or dataTYpe"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->c:Landroid/app/PendingIntent;

    const-string v1, "pendingIntent must be set"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;-><init>(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$1;)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

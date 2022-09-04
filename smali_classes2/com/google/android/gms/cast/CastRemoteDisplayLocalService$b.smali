.class public final Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b$a;
    }
.end annotation


# instance fields
.field private a:Landroid/app/Notification;

.field private b:Landroid/app/PendingIntent;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a:Landroid/app/Notification;

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a:Landroid/app/Notification;

    iget-object v0, p1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b:Landroid/app/PendingIntent;

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b:Landroid/app/PendingIntent;

    iget-object v0, p1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->c:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/Notification;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a:Landroid/app/Notification;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/app/Notification;)Landroid/app/Notification;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a:Landroid/app/Notification;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/app/PendingIntent;)Landroid/app/PendingIntent;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b:Landroid/app/PendingIntent;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->c:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b:Landroid/app/PendingIntent;

    return-object v0
.end method

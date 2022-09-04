.class Lcom/google/android/gms/tagmanager/cd$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/cd$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/cd;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/dq;Lcom/google/android/gms/tagmanager/cd$b;Lcom/google/android/gms/tagmanager/cd$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/cd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/cd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cd$1;->a:Lcom/google/android/gms/tagmanager/cd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

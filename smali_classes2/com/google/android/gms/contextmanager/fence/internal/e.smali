.class public Lcom/google/android/gms/contextmanager/fence/internal/e;
.super Lcom/google/android/gms/contextmanager/fence/internal/m$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/contextmanager/fence/internal/e$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/sx$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/sx$a",
            "<",
            "Lcom/google/android/gms/awareness/fence/i;",
            "Lcom/google/android/gms/contextmanager/fence/internal/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/google/android/gms/awareness/fence/i;

.field private final c:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/e$1;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/e$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/fence/internal/e;->a:Lcom/google/android/gms/internal/sx$a;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/awareness/fence/i;Landroid/os/Looper;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/fence/internal/m$a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/awareness/fence/i;

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/e;->b:Lcom/google/android/gms/awareness/fence/i;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/internal/d;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/e;->c:Landroid/os/Handler;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/awareness/fence/i;Landroid/os/Looper;Lcom/google/android/gms/contextmanager/fence/internal/e$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/e;-><init>(Lcom/google/android/gms/awareness/fence/i;Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/e;->c:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/contextmanager/fence/internal/e$a;

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/fence/internal/e;->b:Lcom/google/android/gms/awareness/fence/i;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/contextmanager/fence/internal/e$a;-><init>(Lcom/google/android/gms/awareness/fence/i;Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

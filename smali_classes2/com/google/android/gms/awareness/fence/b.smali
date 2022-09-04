.class public final Lcom/google/android/gms/awareness/fence/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0x4

.field public static final f:I = 0x5

.field public static final g:I = 0x7

.field public static final h:I = 0x8


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs a([I)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "com.google.android.gms.permission.ACTIVITY_RECOGNITION"
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/contextmanager/fence/internal/a;->a([I)Lcom/google/android/gms/contextmanager/fence/internal/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(Lcom/google/android/gms/contextmanager/fence/internal/a;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0
.end method

.method public static varargs b([I)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "com.google.android.gms.permission.ACTIVITY_RECOGNITION"
    .end annotation

    const/4 v0, 0x2

    invoke-static {v0, p0}, Lcom/google/android/gms/contextmanager/fence/internal/a;->a(I[I)Lcom/google/android/gms/contextmanager/fence/internal/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(Lcom/google/android/gms/contextmanager/fence/internal/a;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0
.end method

.method public static varargs c([I)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "com.google.android.gms.permission.ACTIVITY_RECOGNITION"
    .end annotation

    const/4 v0, 0x3

    invoke-static {v0, p0}, Lcom/google/android/gms/contextmanager/fence/internal/a;->a(I[I)Lcom/google/android/gms/contextmanager/fence/internal/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(Lcom/google/android/gms/contextmanager/fence/internal/a;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0
.end method

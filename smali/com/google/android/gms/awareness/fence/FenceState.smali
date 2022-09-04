.class public abstract Lcom/google/android/gms/awareness/fence/FenceState;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/awareness/fence/FenceState$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/google/android/gms/awareness/fence/FenceState;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->b(Landroid/content/Intent;)Lcom/google/android/gms/awareness/fence/FenceState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()I
.end method

.method public abstract c()J
.end method

.method public abstract d()Ljava/lang/String;
.end method

.class public interface abstract Lcom/google/android/gms/games/quest/f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/quest/f$c;,
        Lcom/google/android/gms/games/quest/f$b;,
        Lcom/google/android/gms/games/quest/f$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x1

.field public static final b:I = 0x2

.field public static final c:I = 0x3

.field public static final d:I = 0x4

.field public static final e:I = 0x65

.field public static final f:I = 0x5

.field public static final g:I = 0x66

.field public static final h:I = 0x6

.field public static final i:I = 0x67

.field public static final j:[I

.field public static final k:I = 0x0

.field public static final l:I = 0x1

.field public static final m:Ljava/lang/String; = "quest"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/games/quest/f;->j:[I

    return-void

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x65
        0x5
        0x66
        0x6
        0x67
    .end array-data
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Landroid/content/Intent;
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;[I)Landroid/content/Intent;
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/quest/f$b;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract a(Lcom/google/android/gms/common/api/g;Z[Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Z[",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/quest/f$c;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;[IIZ)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[IIZ)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/quest/f$c;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;)V
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/quest/e;)V
.end method

.method public abstract b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/quest/f$a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
.end method

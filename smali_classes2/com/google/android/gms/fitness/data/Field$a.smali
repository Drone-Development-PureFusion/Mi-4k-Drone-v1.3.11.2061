.class public Lcom/google/android/gms/fitness/data/Field$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/data/Field;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/fitness/data/Field;

.field public static final b:Lcom/google/android/gms/fitness/data/Field;

.field public static final c:Lcom/google/android/gms/fitness/data/Field;

.field public static final d:Lcom/google/android/gms/fitness/data/Field;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "x"

    invoke-static {v0}, Lcom/google/android/gms/fitness/data/Field;->c(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Field;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/fitness/data/Field$a;->a:Lcom/google/android/gms/fitness/data/Field;

    const-string v0, "y"

    invoke-static {v0}, Lcom/google/android/gms/fitness/data/Field;->c(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Field;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/fitness/data/Field$a;->b:Lcom/google/android/gms/fitness/data/Field;

    const-string v0, "z"

    invoke-static {v0}, Lcom/google/android/gms/fitness/data/Field;->c(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Field;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/fitness/data/Field$a;->c:Lcom/google/android/gms/fitness/data/Field;

    const-string v0, "debug_session"

    invoke-static {v0}, Lcom/google/android/gms/fitness/data/Field;->j(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Field;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/fitness/data/Field$a;->d:Lcom/google/android/gms/fitness/data/Field;

    return-void
.end method
